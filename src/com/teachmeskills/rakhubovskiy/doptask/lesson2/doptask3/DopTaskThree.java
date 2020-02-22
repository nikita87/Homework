package com.teachmeskills.rakhubovskiy.doptask.lesson2.doptask3;

/*created by Nikita Rakhubovskiy*/

/*Дано целое число. Если оно является положительным, то прибавить к нему 1.Если отрицательным, то вычесть из него 2.
  Если нулевым, то заменить его на10. Вывести полученное число.*/

import java.util.Scanner;

public class DopTaskThree {

    public static void main (String[] args){

        Scanner sc = new Scanner (System.in);

        System.out.print("Введите любое целое число = ");

        int number = sc.nextInt();

        if (number > 0) {
            number = number + 1;
        } else if (number < 0) {
            number = number - 2;
        } else {
            number = 10;
        }

        System.out.println("Новое число = " + number);

        sc.close();

    }
}


