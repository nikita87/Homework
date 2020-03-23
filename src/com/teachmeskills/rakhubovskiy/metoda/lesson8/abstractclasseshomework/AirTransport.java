package com.teachmeskills.rakhubovskiy.metoda.lesson8.abstractclasseshomework;

public abstract class AirTransport extends Transport {

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
    public String description() {
        return super.description() + "\n" +
                "Размах крыльев(м) = " + getSpread() + "\n" +
                "Минимальная длина ВПП(м) = " + getMinLengthOfRunaway();
    }
}
