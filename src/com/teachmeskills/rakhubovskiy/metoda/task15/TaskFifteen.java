package com.teachmeskills.rakhubovskiy.metoda.task15;

/*created by Nikita Rakhubovskiy*/

/*Создать массив, заполнить его случайными элементами, распечатать,
перевернуть, и снова распечатать (при переворачивании нежелательно создавать
еще один массив).*/

import java.util.Scanner;

public class TaskFifteen {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Введите любое целое число = ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        int tmp;

        // заполняем массив
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * n);
            System.out.print(arr[i] + " ");
        }

        //меняем местами элементы массива через переменную tmp
        for (int i = 0; i < arr.length/2; i++){
            tmp = arr[arr.length - i -1];
            arr[arr.length - i - 1] = arr[i];
            arr[i] = tmp;
        }
        System.out.println("");

        // выводим перевернутый массив
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}

