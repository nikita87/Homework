package com.teachmeskills.rakhubovskiy.metoda.task13;

/*created by Nikita Rakhubovskiy*/

/*Создать последовательность случайных чисел, найти и вывести наибольшее
из них.*/

import java.util.Scanner;

public class TaskThirteen {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Введите любое целое число = ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // заполняем массив случайными числами
        for (int i = 0; i < arr.length; i++){
            arr[i] = (int) (Math.random() * n);
            System.out.print(arr[i] + " ");
        }

        int max = arr[0];

        // находим максимальный элемент массива
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }

        System.out.println("\n" + "наибольшее число массива = " + max);
        sc.close();

    }
}
