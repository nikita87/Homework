package by.teachmeskills.rakhubovskiy.lesson8.interfacehomework.doptask1.legs;

public class ToshibaLeg implements ILeg {

    private int price;

    public ToshibaLeg(int price) {
        this.price = price;
    }

    public ToshibaLeg() {
    }

    @Override
    public void step() {
        System.out.println("Робот шагает ногами Toshiba");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
