package com.teachmeskills.rakhubovskiy.metoda.lesson8.interfacehomework.doptask2.jacket;

public class JacketSummer implements IJacket {

    private String season;

    public JacketSummer(String season) {
        this.season = season;
    }

    public JacketSummer() {
    }

    public String getSeason() {
        return season;
    }

    @Override
    public void putOn() {
        System.out.println("Одел летнюю куртку");
    }

    @Override
    public void takeOff() {
        System.out.println("Снял летнюю куртку");
    }
}
