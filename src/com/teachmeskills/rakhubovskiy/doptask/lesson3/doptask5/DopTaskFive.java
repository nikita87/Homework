package com.teachmeskills.rakhubovskiy.doptask.lesson3.doptask5;

/*created by Nikita Rakhubovskiy*/

/*Напишите программу печати таблицы перевода расстояний из дюймов всантиметры для значений длин от 1 до 20 дюймов. 1 дюйм = 2,54 см*/

public class DopTaskFive {

    public  static final double INCH = 2.54; //величина 1 дюйма в сантиметрах

    public static void main(String[] args) {

        for (int i = 1; i <= 20; i++){
            double p = i * INCH;
            if (i == 1) {
                System.out.println("\n" + i + " дюйм = " + p + " см");
            } else if ((i >= 2) && (i <= 4)) {
                System.out.println("\n" + i + " дюйма = " + p + " см");
            } else {
                System.out.println("\n" + i + " дюймов = " + p + " см");
            }
        }
    }
}
