package com.teachmeskills.rakhubovskiy.metoda.lesson8.interfacehomework.doptask2.pants;

public class PantsWinter implements IPants{

    private String season;

    public PantsWinter(String season) {
        this.season = season;
    }

    public PantsWinter() {
    }

    public String getSeason() {
        return season;
    }

    @Override
    public void putOn() {
        System.out.println("Одел зимние штаны");
    }

    @Override
    public void takeOff() {
        System.out.println("Снял зимние штаны");
    }
}
