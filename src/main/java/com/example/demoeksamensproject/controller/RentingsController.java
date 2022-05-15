package com.example.demoeksamensproject.controller;

import com.example.demoeksamensproject.model.Rentings;
import com.example.demoeksamensproject.repository.RentingsRepo;
import com.example.demoeksamensproject.service.RentingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class RentingsController
{
    @Autowired
    JdbcTemplate template;
    @Autowired
    RentingService rentingService;
    @Autowired
    RentingsRepo rentingsRepo;
    RentingService rentingservice = new RentingService();

    @GetMapping("/confirmedorder")
    public String confirmedOrder()
    {
        return "/confirmedorder";
    }

    @PostMapping("/confirmedorder")
    public String confirmedOrder(@ModelAttribute Rentings rentings)
    {
        rentingservice.confirmedOrder(rentings);
        return "/confirmedorder";
    }






    @GetMapping("/renting_list")
    public String rentingList(Model model){
        List<Rentings> rentingsList = rentingService.fetchAllRentings();
        model.addAttribute("rentings", rentingsList);
        return "/renting_list";
    }

    @PostMapping("/renting_list/{customer_id}")
    public List<Rentings> fetchAllRentings()
    {
        String fetchRentings = "SELECT * FROM bilabonnement.renting;";
        RowMapper<Rentings> rentingRowMapper = new BeanPropertyRowMapper<>(Rentings.class);

        System.out.println(template.update(fetchRentings, rentingRowMapper));

        return template.query(fetchRentings, rentingRowMapper);
    }


}

