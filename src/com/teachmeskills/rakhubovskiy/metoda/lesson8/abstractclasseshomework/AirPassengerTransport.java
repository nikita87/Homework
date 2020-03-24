package com.teachmeskills.rakhubovskiy.metoda.lesson8.abstractclasseshomework;

public class AirPassengerTransport extends AirTransport {

    private Integer passengerCapacity;
    private Boolean isBusinessClass;

    public AirPassengerTransport(String brand, Integer enginePower, Integer maxSpeed, Double mass, Double spread, Integer minLengthOfRunaway, Integer passengerCapacity, Boolean isBusinessClass) {
        super(brand, enginePower, maxSpeed, mass, spread, minLengthOfRunaway);
        this.passengerCapacity = passengerCapacity;
        this.isBusinessClass = isBusinessClass;
    }

    public Integer getPassengerCapacity() {
        return passengerCapacity;
    }

    public Boolean getBusinessClass() {
        return isBusinessClass;
    }

    @Override
    public String description() {
        return super.description() + "\n" +
                "Количество пассажиров на борту = " + getPassengerCapacity() + "\n" +
                "Наличие бизнес-класса = " + getBusinessClass();
    }

    public void isLoading(int amountOfPassenger){
        if (amountOfPassenger < getPassengerCapacity()){
            System.out.println("Есть свободные места.");
        } else if (amountOfPassenger == getPassengerCapacity()){
            System.out.println("Самолет заполнен. Свбодных мест нет!");
        } else {
            System.out.println("Вам нужен самолет с большей вместимостью!");
        }
    }
}

