package com.teachmeskills.rakhubovskiy.metoda.task5;

/*created by Nikita Rakhubovskiy*/
/*Дано любое натуральное 4-х значное число. Верно ли, что все цифры числа различны?*/

import java.util.Scanner;

public class TaskFive {

    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите число от 1000 до 9999:");

        String strNumber = sc.nextLine();
        int number = Integer.parseInt(strNumber);

        int a, b, c, d;

        //поиск каждой цифры
        a = number/1000;
        b = ((number/100) % 10);
        c = ((number/10) % 10);
        d =  number % 10;

        if ((a != b) && (b != c) && (c != d) && (d != a) && (c != a)) {
            System.out.println("Все цифры числа: " + number + " различны");
        } else if ((a == b) && (b == c) && (c == d) && (d == a)){
            System.out.println("Все цифры числа: " + number + " одинаковы");
        } else {
            System.out.println("Не все цифры числа: " + number + " различны");
        }

        sc.close();
    }
}
