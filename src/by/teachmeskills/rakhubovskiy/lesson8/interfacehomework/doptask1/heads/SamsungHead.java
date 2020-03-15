package by.teachmeskills.rakhubovskiy.lesson8.interfacehomework.doptask1.heads;

public class SamsungHead implements IHead {

    private Integer price;

    public SamsungHead(int price) {
        this.price = price;
    }

    public SamsungHead() {
    }


    @Override
    public void speek() {
        System.out.println("Говорит голова Samsung");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
