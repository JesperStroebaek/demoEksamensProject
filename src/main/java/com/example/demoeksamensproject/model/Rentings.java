package com.example.demoeksamensproject.model;

public class Rentings
{
    private int rentingId;
    private String startDate;
    private String pickUpPlace;
    private String endDate;

    public Rentings()
    {
    }

    public Rentings(int rentingId, String startDate, String pickUpPlace, String endDate)
    {
        this.rentingId = rentingId;
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
