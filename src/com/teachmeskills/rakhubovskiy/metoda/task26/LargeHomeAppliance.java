package  com.teachmeskills.rakhubovskiy.metoda.task26;

public abstract class LargeHomeAppliance extends Appliance {

    private String typeOfEmbedding;

    public LargeHomeAppliance(String nameOfBrand, Double length, Double width, Double height, Double workingPower, String typeOfEmbedding) {
        super(nameOfBrand, length, width, height, workingPower);
        this.typeOfEmbedding = typeOfEmbedding;
    }

    public String getTypeOfEmbedding() {
        return typeOfEmbedding;
    }

    public void setTypeOfEmbedding(String typeOfEmbedding) {
        this.typeOfEmbedding = typeOfEmbedding;
    }

    public abstract void function();


}
