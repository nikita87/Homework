package com.teachmeskills.rakhubovskiy.doptask.lesson2.doptask4;

/*created by Nikita Rakhubovskiy*/

/* Даны 3 целых числа. Найти количество положительных чисел в исходномнаборе.*/

import java.util.Scanner;

public class DopTaskFour {
    public static void main(String[] args) {

        int countPosNumber = 0;

        Scanner sc = new Scanner (System.in);

        System.out.println("Введите три целых числа:");

        System.out.print("a = ");
        int a = sc.nextInt();

        System.out.print("b = ");
        int b = sc.nextInt();

        System.out.print("c = ");
        int c = sc.nextInt();

        if (a > 0) {
            countPosNumber++;
        }
        if (b > 0) {
            countPosNumber++;
        }
        if (c > 0) {
            countPosNumber++;
        }

        System.out.println("Количество положительных чисел = " + countPosNumber);

        sc.close();

    }
}

