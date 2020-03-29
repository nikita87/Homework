package com.teachmeskills.rakhubovskiy.metoda.lesson8.interfacehomework.doptask3;

import java.util.Random;

public class Shattle implements IStart {

    @Override
    public boolean preLaunchSystemCheck() {
        Random rand = new Random();
        System.out.println("Производится предстартовая проверка систем запуска Шаттла...");
        int launchCheckShattleCode = rand.nextInt(11);
        if (launchCheckShattleCode > 3){
            System.out.println("Проверка прошла успешно!");
            return true;
        }
        System.out.println("Проверка не прошла.");
        return false;
    }

    @Override
    public void engineStart() {
        System.out.println("Двигатели Шаттла запущены. Все системы в норме.");
    }

    @Override
    public void start() {
        System.out.println("Старт Шаттла!");

    }
}
