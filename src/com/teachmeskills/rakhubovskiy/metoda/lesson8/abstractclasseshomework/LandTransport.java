package com.teachmeskills.rakhubovskiy.metoda.lesson8.abstractclasseshomework;

public abstract class LandTransport extends Transport{

    private Integer amountOfWheels;
    private Double fuelConsumption; //расход топлива(л/100км)

    public LandTransport(String brand, Integer enginePower, Integer maxSpeed, Double mass, Integer amountOfWheels, Double fuelConsumption) {
        super(brand, enginePower, maxSpeed, mass);
        this.amountOfWheels = amountOfWheels;
        this.fuelConsumption = fuelConsumption;
    }

    public Integer getAmountOfWheels() {
        return amountOfWheels;
    }

    public Double getFuelConsumption() {
        return fuelConsumption;
    }

    public abstract void description();
}
