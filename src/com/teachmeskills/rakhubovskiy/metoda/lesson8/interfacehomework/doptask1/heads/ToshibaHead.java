package com.teachmeskills.rakhubovskiy.metoda.lesson8.interfacehomework.doptask1.heads;

public class ToshibaHead implements IHead {

    private Integer price;

    public ToshibaHead(int price) {
        this.price = price;
    }

    public ToshibaHead(){
    }

    @Override
    public void speek() {
        System.out.println("Говорит голова Toshiba");

    }

    @Override
    public int getPrice() {
        return price;
    }
}
