package com.example.demoeksamensproject.service;

import com.example.demoeksamensproject.model.Rentings;
import com.example.demoeksamensproject.repository.RentingsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RentingService {
//RentingsRepo rentingsRepo = new RentingsRepo();

@Autowired
RentingsRepo rentingsRepo;

    public void confirmedOrder(Rentings rentings){
        rentingsRepo.confirmedOrder(rentings);
    }



    public List<Rentings> fetchAllRentings(){
        return rentingsRepo.fetchAllRentings();
    }
}
