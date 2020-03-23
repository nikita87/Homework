package com.teachmeskills.rakhubovskiy.metoda.lesson8.interfacehomework.doptask2.shoes;

public class ShoesWinter implements IShoes {

    private String season;

    public ShoesWinter(String season) {
        this.season = season;
    }

    public ShoesWinter() {
    }

    public String getSeason() {
        return season;
    }

    @Override
    public void putOn() {
        System.out.println("Надел зимнюю обувь");
    }

    @Override
    public void takeOff() {
        System.out.println("Снял зимнюю обувь");

    }
}
