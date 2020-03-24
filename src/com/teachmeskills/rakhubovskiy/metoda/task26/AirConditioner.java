package  com.teachmeskills.rakhubovskiy.metoda.task26;

public class AirConditioner extends AirConditioningEquipment {

    private String typeOfConditioner;
    private String typeOfIndoorUnit;

    public AirConditioner(String nameOfBrand, Double length, Double width, Double height, Double workingPower, String kindOfMounting, String typeOfConditioner, String typeOfIndoorUnit) {
        super(nameOfBrand, length, width, height, workingPower, kindOfMounting);
        this.typeOfConditioner = typeOfConditioner;
        this.typeOfIndoorUnit = typeOfIndoorUnit;
    }

    public String getTypeOfConditioner() {
        return typeOfConditioner;
    }

    public void setTypeOfConditioner(String typeOfConditioner) {
        this.typeOfConditioner = typeOfConditioner;
    }

    public String getTypeOfIndoorUnit() {
        return typeOfIndoorUnit;
    }

    public void setTypeOfIndoorUnit(String typeOfIndoorUnit) {
        this.typeOfIndoorUnit = typeOfIndoorUnit;
    }

    @Override
    public void function() {
        System.out.println("Кондиционер охлаждает воздух");
    }


}
