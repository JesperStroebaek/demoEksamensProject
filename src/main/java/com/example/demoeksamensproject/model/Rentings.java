package com.example.demoeksamensproject.model;

    public class Rentings

{
    Customer customer = new Customer();
    com.example.demoeksamensproject.model.car car = new car();
    private int rentingId;
    private int customerId = customer.getCustomerId();
    private int carId  = car.g

    private String startDate;
    private String pickUpPlace;
    private String endDate;

    public Rentings()
    {
    }

    public <customerId> Rentings(int rentingId, int customerId, String startDate, String pickUpPlace, String endDate)
    {
        this.rentingId = rentingId;
        this.customerId = customerId;
        this.startDate = startDate;
        this.pickUpPlace = pickUpPlace;
        this.endDate = endDate;
    }

    public String getStartDate()
    {
        return startDate;
    }

    public String getPickUpPlace()
    {
        return pickUpPlace;
    }

    public String getEndDate()
    {
        return endDate;
    }

    public int getRentingId()
    {
        return rentingId;
    }



}
