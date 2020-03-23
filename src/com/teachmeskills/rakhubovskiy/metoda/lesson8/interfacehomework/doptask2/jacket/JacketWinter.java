package com.teachmeskills.rakhubovskiy.metoda.lesson8.interfacehomework.doptask2.jacket;

public class JacketWinter implements IJacket {

    private String season;

    public JacketWinter(String season) {
        this.season = season;
    }

    public JacketWinter() {
    }

    public String getSeason() {
        return season;
    }

    @Override
    public void putOn() {
        System.out.println("Одел зимнюю куртку");
    }

    @Override
    public void takeOff() {
        System.out.println("Снял зимнюю куртку");
    }
}
