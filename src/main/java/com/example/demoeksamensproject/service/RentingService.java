package com.example.demoeksamensproject.service;

import com.example.demoeksamensproject.controller.RentingsController;
import com.example.demoeksamensproject.model.Rentings;
import com.example.demoeksamensproject.repository.RentingsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RentingService {
RentingsRepo rentingsRepo = new RentingsRepo();


    public void confirmOrder(Rentings rentings){
        rentingsRepo.confirmOrder(rentings);
    }



    public List<Rentings> fetchAllRentings(){
        return rentingsRepo.fetchAllRentings();
    }
}
