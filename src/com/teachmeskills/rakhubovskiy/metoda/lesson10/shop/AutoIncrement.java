package com.teachmeskills.rakhubovskiy.metoda.lesson10.shop;

public class AutoIncrement {

    private static int id = 0;

    public static int nextId(){
        id++;
        return id;
    }
}
