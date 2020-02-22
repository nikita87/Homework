package com.teachmeskills.rakhubovskiy.doptask.lesson2.doptask6;

/*created by Nikita Rakhubovskiy*/

/*Даны 2 числа. Вывести большее из них*/

import java.util.Scanner;

public class DopTaskSix {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите два числа:");

        System.out.print("a = ");
        double a = sc.nextDouble();

        System.out.print("b = ");
        double b = sc.nextDouble();

        if (a > b) {
            System.out.println("max a = " + a);
        } else if (b > a) {
            System.out.println("max b = " + b);
        } else {
            System.out.println("a = b");
        }

        sc.close();
    }
}
