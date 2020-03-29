package com.teachmeskills.rakhubovskiy.metoda.task10;

/*created by Nikita Rakhubovskiy*/

/* Посчитать факториал числа в границах от 10 до 15 (не используя рекурсию).*/

import java.util.Scanner;

public class TaskTen {
    public static void main(String[] args) {

        System.out.println("Введите целое число от 10 до 15:");

        Scanner sc = new Scanner (System.in);
        int x = sc.nextInt();

        int fact = 1; //переменная содержит факториал заданного числа

        for(int i = 1; i <= x; i++){
            fact *= i;
        }

        System.out.println("факториал " + x + " = " + fact);

        sc.close();
    }
}

