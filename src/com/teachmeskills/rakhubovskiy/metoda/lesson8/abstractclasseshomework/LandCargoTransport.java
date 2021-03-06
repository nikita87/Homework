package com.teachmeskills.rakhubovskiy.metoda.lesson8.abstractclasseshomework;

public class LandCargoTransport extends LandTransport {

    private Integer carryingCapacity; // грузоподъемность в тоннах

    public LandCargoTransport(String brand, Integer enginePower, Integer maxSpeed, Double mass, Integer amountOfWheels, Double fuelConsumption, Integer carryingCapacity) {
        super(brand, enginePower, maxSpeed, mass, amountOfWheels, fuelConsumption);
        this.carryingCapacity = carryingCapacity;
    }

    public Integer getCarryingCapacity() {
        return carryingCapacity;
    }

    @Override
    public String description() {
        return super.description() + "\n" +
                "Расход топлива(л/100км) = " + getFuelConsumption() + "\n" +
                "Грузоподъемность(т) = " + getCarryingCapacity();
    }

    public void isLoading(int cargoWeight){
        if (cargoWeight <= getCarryingCapacity()){
            System.out.println("Грузовик загружен!");
        } else {
            System.out.println("Вам нужен грузовик побольше!");
        }
    }
}

