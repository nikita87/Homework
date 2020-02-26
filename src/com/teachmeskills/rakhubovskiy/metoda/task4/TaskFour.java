package com.teachmeskills.rakhubovskiy.metoda.task4;

/*created by Nikita Rakhubovskiy*/
/*Определить число, полученное выписыванием в обратном порядке цифр любого 4-х значного натурального числа n.*/

import java.util.Scanner;

public class TaskFour {

    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите число от 1000 до 9999:");

        String strNumber = sc.nextLine();
        int number = Integer.parseInt(strNumber);

        //находим каждую цифру и записываем число в обратном порядке
        int m = ((number % 10) * 1000) + (((number/10) % 10) * 100) + (((number/100) % 10) * 10) + (number/1000);

        System.out.println("Получилось число: " + m);

        sc.close();
    }
}


