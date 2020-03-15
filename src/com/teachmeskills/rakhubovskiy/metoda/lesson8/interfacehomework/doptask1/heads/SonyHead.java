package by.teachmeskills.rakhubovskiy.doplessons.lesson8.interfacehomework.doptask1.heads;

public class SonyHead implements IHead {

    private Integer price;

    public SonyHead(int price) {
        this.price = price;
    }

    public SonyHead() {
    }

    @Override
    public void speek() {
        System.out.println("Говорит голова Sony");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
