package com.teachmeskills.rakhubovskiy.metoda.lesson8.abstractclasseshomework;

public class AirTransport extends Transport {

    private Double spread; //размах крыльев(м)
    private  Integer minLengthOfRunaway; //минимальная длина взлетно-посадочной полосы для взлета(м)


    public AirTransport(String brand, Integer enginePower, Integer maxSpeed, Double mass, Double spread, Integer minLengthOfRunaway) {
        super(brand, enginePower, maxSpeed, mass);
        this.spread = spread;
        this.minLengthOfRunaway = minLengthOfRunaway;
    }

    public Double getSpread() {
        return spread;
    }

    public Integer getMinLengthOfRunaway() {
        return minLengthOfRunaway;
    }

    @Override
    public void description() {
        System.out.println("Марка = " + getBrand() + "\n" +
                "Мощность двигателя(л.с.) = " + getEnginePower() + "\n" +
                "Мощность двигателя(кВт) = " + powerEngineInKiloWatt() + "\n" +
                "Максимальная скорость(км/ч) = " + getMaxSpeed() + "\n" +
                "Масса(т) = " + getMass() + "\n" +
                "Размах крыльев(м) = " + getSpread() + "\n" +
                "Минимальная длина ВПП(м) = " + getMinLengthOfRunaway() + "\n");

    }
}
