package  com.teachmeskills.rakhubovskiy.metoda.task26;

public class Iron extends SmallHouseholdAppliance {

    private String typeOfIron;

    public Iron(String nameOfBrand, Double length, Double width, Double height, Double workingPower, String typeOfSmallHouseholdAppliance, String typeOfIron) {
        super(nameOfBrand, length, width, height, workingPower, typeOfSmallHouseholdAppliance);
        this.typeOfIron = typeOfIron;
    }

    public String getTypeOfIron() {
        return typeOfIron;
    }

    public void setTypeOfIron(String typeOfIron) {
        this.typeOfIron = typeOfIron;
    }

    @Override
    public void turnOn() {
        System.out.println("Утюг включен в розетку!");
    }

    @Override
    public void turnOff() {
        System.out.println("Утюг выключен из розетки!");
    }

    @Override
    public void function() {
        System.out.println("Гладит одежду");

    }
}
