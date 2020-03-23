package  com.teachmeskills.rakhubovskiy.metoda.task26;

public class AirHeater extends AirConditioningEquipment {

    private String typeOfHeatingElement;
    private String typeOfControl;

    public AirHeater(String nameOfBrand, Double length, Double width, Double height, Double workingPower, String kindOfMounting, String typeOfHeatingElement, String typeOfControl) {
        super(nameOfBrand, length, width, height, workingPower, kindOfMounting);
        this.typeOfHeatingElement = typeOfHeatingElement;
        this.typeOfControl = typeOfControl;
    }

    public String getTypeOfHeatingElement() {
        return typeOfHeatingElement;
    }

    public void setTypeOfHeatingElement(String typeOfHeatingElement) {
        this.typeOfHeatingElement = typeOfHeatingElement;
    }

    public String getTypeOfControl() {
        return typeOfControl;
    }

    public void setTypeOfControl(String typeOfControl) {
        this.typeOfControl = typeOfControl;
    }

    @Override
    public void function() {
        System.out.println("Нагревает воздух");

    }
}
