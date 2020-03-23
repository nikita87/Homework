package  com.teachmeskills.rakhubovskiy.metoda.task26;

public class Refrigerator extends LargeHomeAppliance {

    private String typeOfRefrigerator;
    private String typeOfConstruction;

    public Refrigerator(String nameOfBrand, Double length, Double width, Double height, Double workingPower, String typeOfEmbedding, String typeOfRefrigerator, String typeOfConstruction) {
        super(nameOfBrand, length, width, height, workingPower, typeOfEmbedding);
        this.typeOfRefrigerator = typeOfRefrigerator;
        this.typeOfConstruction = typeOfConstruction;
    }

    public String getTypeOfRefrigerator() {
        return typeOfRefrigerator;
    }

    public void setTypeOfRefrigerator(String typeOfRefrigerator) {
        this.typeOfRefrigerator = typeOfRefrigerator;
    }

    public String getTypeOfConstruction() {
        return typeOfConstruction;
    }

    public void setTypeOfConstruction(String typeOfConstruction) {
        this.typeOfConstruction = typeOfConstruction;
    }

    @Override
    public void turnOn() {
        System.out.println("Холодильник включен в розетку!");
    }

    @Override
    public void turnOff() {
        System.out.println("Холодильник выключен из розетки!");
    }

    @Override
    public void function() {
        System.out.println("Охлаждает и замораживает продукты");

    }
}
