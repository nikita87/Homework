package  com.teachmeskills.rakhubovskiy.metoda.task26;

public class Washer extends LargeHomeAppliance {

    private String typeOfWasher;

    public Washer(String nameOfBrand, Double length, Double width, Double height, Double workingPower, String typeOfEmbedding, String typeOfWasher) {
        super(nameOfBrand, length, width, height, workingPower, typeOfEmbedding);
        this.typeOfWasher = typeOfWasher;
    }

    public String getTypeOfWasher() {
        return typeOfWasher;
    }

    public void setTypeOfWasher(String typeOfWasher) {
        this.typeOfWasher = typeOfWasher;
    }

    @Override
    public void turnOn() {
        System.out.println("Стиральная машина включена в розетку!");
    }

    @Override
    public void turnOff() {
        System.out.println("Стиральная машина выключена из розетки!");
    }

    @Override
    public void function() {
        System.out.println("Стирает одежду.");

    }
}
