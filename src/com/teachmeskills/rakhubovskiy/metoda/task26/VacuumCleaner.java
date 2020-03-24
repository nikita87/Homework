package  com.teachmeskills.rakhubovskiy.metoda.task26;

public class VacuumCleaner extends SmallHouseholdAppliance {

    private String typeOfConstruction;

    public VacuumCleaner(String nameOfBrand, Double length, Double width, Double height, Double workingPower, String typeOfSmallHouseholdAppliance, String typeOfConstruction) {
        super(nameOfBrand, length, width, height, workingPower, typeOfSmallHouseholdAppliance);
        this.typeOfConstruction = typeOfConstruction;
    }

    public String getTypeOfConstruction() {
        return typeOfConstruction;
    }

    public void setTypeOfConstruction(String typeOfConstruction) {
        this.typeOfConstruction = typeOfConstruction;
    }

    @Override
    public void turnOn() {
        System.out.println("Пылесос включен в розетку!");
    }

    @Override
    public void turnOff() {
        System.out.println("Пылесос выключен из розетки!");
    }

    @Override
    public void function() {
        System.out.println("Пылесосит");

    }
}
