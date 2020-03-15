package by.teachmeskills.rakhubovskiy.lesson8.interfacehomework.doptask1.legs;

public class SamsungLeg implements ILeg {

    private Integer price;

    public SamsungLeg(Integer price) {
        this.price = price;
    }

    public SamsungLeg() {
    }

    @Override
    public void step() {
        System.out.println("Робот шагает ногами Samsung");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
