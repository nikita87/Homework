package  com.teachmeskills.rakhubovskiy.metoda.task26;

import com.sun.org.apache.xpath.internal.SourceTree;

public class AirSaturator extends AirConditioningEquipment {

    private String typeOfAirSaturator;

    public AirSaturator(String nameOfBrand, Double length, Double width, Double height, Double workingPower, String kindOfMounting, String typeOfAirSaturator) {
        super(nameOfBrand, length, width, height, workingPower, kindOfMounting);
        this.typeOfAirSaturator = typeOfAirSaturator;
    }

    public String getTypeOfAirSaturator() {
        return typeOfAirSaturator;
    }

    public void setTypeOfAirSaturator(String typeOfAirSaturator) {
        this.typeOfAirSaturator = typeOfAirSaturator;
    }

    @Override
    public void function() {
        System.out.println("Увлажняте воздух");

    }
}
