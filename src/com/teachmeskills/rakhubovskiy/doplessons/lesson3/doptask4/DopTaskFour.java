package com.teachmeskills.rakhubovskiy.doplessons.lesson3.doptask4;

/*created by Nikita Rakhubovskiy*/

/*Составьте программу, вычисляющую A*B, не пользуясь операцией умножения.*/

import java.util.Scanner;

public class DopTaskFour {

    public static void main(String[] args) {

        System.out.println("Введите числа A и B:");

        Scanner sc = new Scanner(System.in);

        System.out.print("A = ");
        int a = sc.nextInt();

        System.out.print("B = ");
        int b = sc.nextInt();

        int pro = 0;

        for (int i = 1; i <= b; i++){
            pro += a;
        }

        System.out.println("A * B = " + pro);
        sc.close();
    }
}
