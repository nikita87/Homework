package com.teachmeskills.rakhubovskiy.metoda.lesson8.abstractclasseshomework;

public class Transport {

    private String brand;
    private Integer enginePower; //мощность двигателя в л.с.
    private Integer maxSpeed; // в км/ч
    private Double mass; // масса в кг

    public Transport(String brand, Integer enginePower, Integer maxSpeed, Double mass) {
        this.brand = brand;
        this.enginePower = enginePower;
        this.maxSpeed = maxSpeed;
        this.mass = mass;
    }

    public String getBrand() {
        return brand;
    }

    public Integer getEnginePower() {
        return enginePower;
    }

    public Integer getMaxSpeed() {
        return maxSpeed;
    }

    public Double getMass() {
        return mass;
    }

    public Double powerEngineInKiloWatt(){
        return getEnginePower() * 0.74;
    }
}
