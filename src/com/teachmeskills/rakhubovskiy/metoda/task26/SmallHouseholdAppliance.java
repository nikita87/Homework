package  com.teachmeskills.rakhubovskiy.metoda.task26;

public abstract class SmallHouseholdAppliance extends Appliance {

    private String typeOfSmallHouseholdAppliance;

    public SmallHouseholdAppliance(String nameOfBrand, Double length, Double width, Double height, Double workingPower, String typeOfSmallHouseholdAppliance) {
        super(nameOfBrand, length, width, height, workingPower);
        this.typeOfSmallHouseholdAppliance = typeOfSmallHouseholdAppliance;
    }

    public String getTypeOfSmallHouseholdAppliance() {
        return typeOfSmallHouseholdAppliance;
    }

    public void setTypeOfSmallHouseholdAppliance(String typeOfSmallHouseholdAppliance) {
        this.typeOfSmallHouseholdAppliance = typeOfSmallHouseholdAppliance;
    }

    public abstract void function();
}
