package com.teachmeskills.rakhubovskiy.metoda.task6;

/*created by Nikita Rakhubovskiy*/

/*Создайте число. Определите, является ли число трехзначным. Определите, является
ли его последняя цифра семеркой. Определите, является ли число четным.*/

import java.util.Scanner;

public class TaskSix {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Введите число n = ");
        int number = sc.nextInt();

        StringBuilder sb = new StringBuilder();
        sb.append(number);

        int countDigits = sb.length(); // находим кол-во цифр заданного числа

        int lastDigit = number % 10;//определяем последнюю цифру заданного числа

        if (countDigits == 3) {
            System.out.println("Заданное число является трехзначным");
        } else {
            System.out.println("Заданное число не является трехзначным");
        }

        if (lastDigit == 7) {
            System.out.println("Последняя цифра заданного числа равна 7");
        } else {
            System.out.println("Последняя цифра заданного числа не равна 7");
        }

        if (number % 2 == 0) {
            System.out.println("Число четное");
        } else {
            System.out.println("Число нечетное");
        }

        sc.close();
    }
}
