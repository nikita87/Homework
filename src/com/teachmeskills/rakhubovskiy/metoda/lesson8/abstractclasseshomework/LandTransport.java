package com.teachmeskills.rakhubovskiy.metoda.lesson8.abstractclasseshomework;

public class LandTransport extends Transport{

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

    @Override
    public void description() {
        System.out.println("Марка = " + getBrand() + "\n" +
            "Мощность двигателя(л.с.) = " + getEnginePower() + "\n" +
            "Мощность двигателя(кВт) = " + powerEngineInKiloWatt() + "\n" +
            "Максимальная скорость(км/ч) = " + getMaxSpeed() + "\n" +
            "Масса(т) = " + getMass() + "\n" +
            "Количество колес(шт.) = " + getAmountOfWheels() + "\n" +
            "Расход топлива(л/100км) = " + getFuelConsumption());

    }
}
