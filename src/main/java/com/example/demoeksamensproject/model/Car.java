package com.example.demoeksamensproject.model;

public class Car
{
    private int carId;
    private String brand;
    private String model;
    private String licensePlateNumber;
    private String chassisNumber;

    public Car() {}

    public Car(int carId, String brand, String model, String licensePlateNumber, String chassisNumber)
    { this.carId = carId;
        this.brand = brand;
        this.model = model;
        this.licensePlateNumber = licensePlateNumber;
       this.chassisNumber = chassisNumber;


    }

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public String getLicensePlateNumber()
    {
        return licensePlateNumber;
    }

    public void setLicensePlateNumber(String licensePlateNumber)
    {
        this.licensePlateNumber = licensePlateNumber;
    }

    public String getChassisNumber()
    {
        return chassisNumber;
    }

    public void setChassisNumber(String chassisNumber)
    {
        this.chassisNumber = chassisNumber;
    }

    public String getBrand()
    {
        return brand;
    }

    public void setBrand(String brand)
    {
        this.brand = brand;
    }

    public String getModel()
    {
        return model;
    }

    public void setModel(String model)
    {
        this.model = model;
    }


    @Override
    public String toString()
    {
        return "Car{" +
                "licensePlateNumber='" + licensePlateNumber + '\'' +
                ", chassisNumber='" + chassisNumber + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' ;
    }
}

