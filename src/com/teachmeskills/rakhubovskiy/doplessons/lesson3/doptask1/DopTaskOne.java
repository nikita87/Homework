package com.teachmeskills.rakhubovskiy.doplessons.lesson3.doptask1;

/*created by Nikita Rakhubovskiy*/

/*Начав тренировки, спортсмен в первый день пробежал 10 км.
 Каждый день он увеличивал дневную норму на 10% нормы предыдущего дня.
 Какой суммарный путь пробежит спортсмен за 7 дней?*/

import java.math.BigDecimal;
import java.math.RoundingMode;

public class DopTaskOne {

    public static void main (String[] args){

    double dist = 10; //путь, который пробежал спортсмен в первый день
    double sumDist = 0;

    //находим суммарную дистанцию за следющие 6 дней
    for (int i = 0; i < 6; i++){
        dist = dist * 0.1 + dist;
        sumDist += dist;
    }

    //находим суммарный путь с учетом 10 км в первый день
        sumDist = sumDist + 10;
        BigDecimal bd = new BigDecimal(sumDist);
        bd = bd.setScale(3, RoundingMode.HALF_UP);
        double s = bd.doubleValue();

        System.out.println("sumDist = " + s);
    }
}
