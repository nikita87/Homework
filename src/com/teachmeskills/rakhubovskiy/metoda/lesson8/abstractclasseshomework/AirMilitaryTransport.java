package com.teachmeskills.rakhubovskiy.metoda.lesson8.abstractclasseshomework;

public class AirMilitaryTransport extends AirTransport {

    private Boolean isCatapult;
    private Integer amountOfMissiles; //количество ракет на борту

    public AirMilitaryTransport(String brand, Integer enginePower, Integer maxSpeed, Double mass, Double spread, Integer minLengthOfRunaway, Boolean isCatapult, Integer amountOfMissiles) {
        super(brand, enginePower, maxSpeed, mass, spread, minLengthOfRunaway);
        this.isCatapult = isCatapult;
        this.amountOfMissiles = amountOfMissiles;
    }

    public Boolean getCatapult() {
        return isCatapult;
    }

    public Integer getAmountOfMissiles() {
        return amountOfMissiles;
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
            "Наличие системы катапультирования = " + getCatapult() + "\n" +
            "Количество ракет на борту(шт.) = " + getAmountOfMissiles());
    }

    public void shoot(){
        if (getAmountOfMissiles() > 0){
            System.out.println("Ракета пошла!");
        } else {
            System.out.println("Боеприпасы отсутствуют.");
        }
    }

    public void baleOut(){
        if (isCatapult == true){
            System.out.println("Катапультирование прошло успешно!");
        } else {
            System.out.println("У вас нет системы катапультирования.");
        }
    }
}
