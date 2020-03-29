package com.teachmeskills.rakhubovskiy.metoda.lesson8.interfacehomework.doptask1.hands;

public class SonyHand implements IHand {

    private Integer price;

    public SonyHand(Integer price) {
        this.price = price;
    }

    public SonyHand() {
    }

    @Override
    public void upHand() {
        System.out.println("Робот поднял руку Sony и приветствует");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
