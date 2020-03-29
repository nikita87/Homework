package com.teachmeskills.rakhubovskiy.metoda.lesson8.interfacehomework.doptask2.pants;

public class PantsSummer implements IPants{

    private String season;

    public PantsSummer(String season) {
        this.season = season;
    }

    public PantsSummer() {
    }

    public String getSeason() {
        return season;
    }

    @Override
    public void putOn() {
        System.out.println("Одел летние штаны");
    }

    @Override
    public void takeOff() {
        System.out.println("Снял летние штаны");
    }
}

