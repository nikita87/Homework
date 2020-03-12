package com.teachmeskills.rakhubovskiy.doplessons.lesson2.doptask5;

/*created by Nikita Rakhubovskiy*/

/* Даны 3 целых числа. Найти количество положительных и отрицательныхчисел в исходном наборе.*/

import java.util.Scanner;

public class DopTaskFive {
    public static void main(String[] args) {

        int countPosNumber = 0;
        int countNegNumber = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите три целых числа:");

        System.out.print("a = ");
        int a = sc.nextInt();

        System.out.print("b = ");
        int b = sc.nextInt();

        System.out.print("c = ");
        int c = sc.nextInt();

        if (a > 0) {
            countPosNumber++;
        } else if (a < 0) {
            countNegNumber++;
        }

        if (b > 0) {
            countPosNumber++;
        } else if (b < 0) {
            countNegNumber++;
        }
        if (c > 0) {
            countPosNumber++;
        } else if (c < 0) {
            countNegNumber++;
        }

        System.out.println("Количество положительных чисел = " + countPosNumber);
        System.out.println("Количество отрицательных чисел = " + countNegNumber);

        sc.close();
    }

}

