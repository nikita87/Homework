package by.teachmeskills.rakhubovskiy.doplessons.lesson8.abstractclasseshomework;

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
    public void description() {
        System.out.println("Марка = " + getBrand() + "\n" +
            "Мощность двигателя(л.с.) = " + getEnginePower() + "\n" +
            "Мощность двигателя(кВт) = " + powerEngineInKiloWatt() + "\n" +
            "Максимальная скорость(км/ч) = " + getMaxSpeed() + "\n" +
            "Масса(т) = " + getMass() + "\n" +
            "Размах крыльев(м) = " + getSpread() + "\n" +
            "Минимальная длина ВПП(м) = " + getMinLengthOfRunaway() + "\n" +
            "Количество пассажиров на борту = " + getPassengerCapacity() + "\n" +
            "Наличие бизнес-класса = " + getBusinessClass());
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

