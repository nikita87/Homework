package com.teachmeskills.rakhubovskiy.metoda.lesson12.doptask4;

import java.io.Serializable;

public class Car implements Serializable {

    private String carModel;
    private Integer maxSpeed;
    private Double price;
    private static final long serialVersionUID = 1L;

    public Car(String carModel, Integer maxSpeed, Double price) {
        this.carModel = carModel;
        this.maxSpeed = maxSpeed;
        this.price = price;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public Integer getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(Integer maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carModel='" + carModel + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", price=" + price +
                '}';
    }
}
