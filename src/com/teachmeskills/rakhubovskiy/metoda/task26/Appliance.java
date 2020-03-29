package  com.teachmeskills.rakhubovskiy.metoda.task26;

public class Appliance {

    private String nameOfBrand;
    private Double length;
    private Double width;
    private Double height;
    private Double workingPower;

    public Appliance(String nameOfBrand, Double length, Double width, Double height, Double workingPower) {
        this.nameOfBrand = nameOfBrand;
        this.length = length;
        this.width = width;
        this.height = height;
        this.workingPower = workingPower;
    }

    public String getNameOfBrand() {
        return nameOfBrand;
    }

    public Double getLength() {
        return length;
    }

    public Double getWidth() {
        return width;
    }

    public Double getHeight() {
        return height;
    }

    public Double getWorkingPower() {
        return workingPower;
    }

    public void turnOn(){
        System.out.println("Включено");
    }

    public void turnOff(){
        System.out.println("Выключено");
    }

}
