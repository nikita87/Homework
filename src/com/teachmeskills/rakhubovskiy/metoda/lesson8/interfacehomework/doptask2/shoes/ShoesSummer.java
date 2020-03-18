package com.teachmeskills.rakhubovskiy.metoda.lesson8.interfacehomework.doptask2.shoes;

public class ShoesSummer implements IShoes {

    private String season;

    public ShoesSummer(String season) {
        this.season = season;
    }

    public ShoesSummer() {
    }

    public String getSeason() {
        return season;
    }

    @Override
    public void putOn() {
        System.out.println("Надел летнюю обувь");
    }

    @Override
    public void takeOff() {
        System.out.println("Снял летнюю обувь");
    }
}
