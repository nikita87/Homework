package com.teachmeskills.rakhubovskiy.doptask.lesson2.doptask1;

/*created by Nikita Rakhubovskiy*/

/*В переменную записываем число. Надо вывести на экран сколько в этом числе цифр и положительное оно или отрицательное.
  Например, "это однозначное положительное число". Достаточно будет определить, является ли число однозначным, двухзначным или трехзначным и более.*/

import java.util.Scanner;

public class DopTaskOne {

    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Введите любое число = ");

        long number = sc.nextLong();

        StringBuilder sb = new StringBuilder();
        sb.append(number);

        long countDigits = sb.length(); //находим кол-во цифр заданного числа

        if (number > 0) {
            System.out.println("В этом числе кол-во цифр = " + countDigits);
            System.out.println("Это " + countDigits + "-значное положительное число");
        } else if (number < 0) {
            System.out.println("В этом числе кол-во цифр = " + countDigits);
            System.out.println("Это " + countDigits + "-значное отрицательное число");
        } else if (number == 0){
            System.out.println("Это ноль");
        }

        sc.close();
    }
}


