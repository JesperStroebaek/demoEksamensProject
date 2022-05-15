package com.example.demoeksamensproject.model;

import java.util.List;

public class Rentings {
    Car car = new Car();
    Customer customer = new Customer();

    private int rentingId;
    int customerId = customer.getCustomerId();
    int carId = car.getCarId();

    private String startDate;
    private String pickUpLocation;
    private String endDate;

    public Rentings() {
    }

    public List<Rentings> rentings(int rentingId, int customerId, int carId, String startDate,
                                   String pickUpLocation, String endDate) {
        this.rentingId = rentingId;
        this.customerId = customerId;
        this.carId = carId;
        this.startDate = startDate;
        this.pickUpLocation = pickUpLocation;
        this.endDate = endDate;

        return rentings(rentingId, customerId, carId, startDate,
                pickUpLocation, endDate);
    }


    public String getStartDate()
    {
        return startDate;
    }

    public String getPickUpLocation()
    {
        return pickUpLocation;
    }

    public String getEndDate()
    {
        return endDate;
    }

    public int getRentingId()
    {
        return rentingId;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }
}
