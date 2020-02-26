package com.teachmeskills.rakhubovskiy.metoda.task12;

/*created by Nikita Rakhubovskiy*/

/*Найдите сумму первых n целых чисел, которые делятся на 3.*/

import java.util.Scanner;

public class TaskTwelve {
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Введите целое число n = ");
        int n = sc.nextInt();

        int k = 1; //счетчик первых n чисел кратных 3
        int sum = 0; //счетчик суммы чисел кратных 3

        for (int i = 1; k <= n; i++){
            if (i % 3 == 0){
                System.out.println(i);
                k++;
                sum += i;
            }
        }

        System.out.println("Сумма первых " + n + " чисел кратных 3 = " + sum);

        sc.close();
    }
}

