package com.teachmeskills.rakhubovskiy.metoda.task11;

/*created by Nikita Rakhubovskiy*/

/* Имеется целое число, определить является ли это число простым, т.е.
делится без остатка только на 1 и себя.*/

import java.util.Scanner;

public class TaskEleven {
    public static void main(String[] args) {

        System.out.print("Введите любое целое число = ");

        Scanner sc = new Scanner (System.in);
        int x = sc.nextInt();

        int d = 0; // переменная хранит количество нулевых остатков
        int q; // переменная хранит остаток от деления

        for (int i = 1; i <= x; i++){
            q = x % i;
            if (q == 0){
                d++;
            }
        }

        if (d == 2){
            System.out.println(x + " - является простым числом");
        } else {
            System.out.println(x + " - не является простым числом");
        }

        sc.close();
    }
}

