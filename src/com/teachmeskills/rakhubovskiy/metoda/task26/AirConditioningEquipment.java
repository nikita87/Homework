package  com.teachmeskills.rakhubovskiy.metoda.task26;

public abstract class AirConditioningEquipment extends Appliance{

    private String kindOfMounting;

    public AirConditioningEquipment(String nameOfBrand, Double length, Double width, Double height, Double workingPower, String kindOfMounting) {
        super(nameOfBrand, length, width, height, workingPower);
        this.kindOfMounting = kindOfMounting;
    }

    public String getKindOfMounting() {
        return kindOfMounting;
    }

    public abstract void function();
}
