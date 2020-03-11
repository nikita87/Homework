package com.teachmeskills.rakhubovskiy.doptask.lesson3.doptask3;

/*created by Nikita Rakhubovskiy*/

/*Вычислить: 1+2+4+8+...+256*/

public class DopTaskThree {

    public static void main(String[] args) {

        int a1 = 1; //первый член арифметической прогрессии
        int a = 256; //последний член арифметической прогрессии
        int n = 256; //количество членов арифметической прогрессии
        int sum; //сумма первых n членов арифметической прогрессии

        sum = (a1 + a) * n / 2;

        System.out.println("сумма чисел от " + a1 + " до " + a + " = " + sum);
    }
}
