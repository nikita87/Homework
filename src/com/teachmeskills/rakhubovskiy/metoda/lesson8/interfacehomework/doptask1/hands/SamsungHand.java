package com.teachmeskills.rakhubovskiy.metoda.lesson8.interfacehomework.doptask1.hands;

public class SamsungHand implements IHand {

    private Integer price;

    public SamsungHand(Integer price) {
        this.price = price;
    }

    public SamsungHand() {
    }

    @Override
    public void upHand() {
        System.out.println("Робот поднял руку Samsung и приветствует");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
