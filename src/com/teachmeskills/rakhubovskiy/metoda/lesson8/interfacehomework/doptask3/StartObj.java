package com.teachmeskills.rakhubovskiy.metoda.lesson8.interfacehomework.doptask3;

import java.util.Random;

public class StartObj implements IStart {

    @Override
    public boolean preLaunchSystemCheck() {
        Random rand = new Random();
        int codePreLaunchSystemCheck = rand.nextInt(2);
        if (codePreLaunchSystemCheck == 1){
            return true;
        }
        return false;
    }

    @Override
    public void engineStart() {
        System.out.println("Двигатели запущены!");
    }

    @Override
    public void start() {
        System.out.println("Пуск!");
    }
}
