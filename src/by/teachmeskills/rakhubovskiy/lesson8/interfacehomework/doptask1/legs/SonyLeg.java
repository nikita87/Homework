package by.teachmeskills.rakhubovskiy.lesson8.interfacehomework.doptask1.legs;

public class SonyLeg implements ILeg {

    private Integer price;

    public SonyLeg(Integer price) {
        this.price = price;
    }

    public SonyLeg() {
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
