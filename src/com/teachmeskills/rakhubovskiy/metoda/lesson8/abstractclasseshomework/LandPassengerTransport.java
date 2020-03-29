package com.teachmeskills.rakhubovskiy.metoda.lesson8.abstractclasseshomework;

public class LandPassengerTransport extends LandTransport {

    private String bodyType;
    private Integer amountOfPassenger;

    public LandPassengerTransport(String brand, Integer enginePower, Integer maxSpeed, Double mass, Integer amountOfWheels, Double fuelConsumption, String bodyType, Integer amountOfPassenger) {
        super(brand, enginePower, maxSpeed, mass, amountOfWheels, fuelConsumption);
        this.bodyType = bodyType;
        this.amountOfPassenger = amountOfPassenger;
    }

    public String getBodyType() {
        return bodyType;
    }

    public Integer getAmountOfPassenger() {
        return amountOfPassenger;
    }

    @Override
    public String description() {
        return super.description() + "\n" +
                "Тип кузова = " + getBodyType() + "\n" +
                "Количество пассажиров = " + getAmountOfPassenger();
    }

    public void calculationMaxWay(double hours){
        double maxWay = getMaxSpeed() * hours;
        System.out.println("За время " + hours + " ч. автомобиль " + getBrand() + ", двигаясь с максимальной скоростью " +
                getMaxSpeed() + " км/ч проедет " + maxWay + " км и израсходует " + calculationFuelConsumptionDuringMaxWay(maxWay) + " л. топлива." );
    }

    private Double calculationFuelConsumptionDuringMaxWay(double maxWay){
        return getFuelConsumption() * (maxWay/100);
    }
}
