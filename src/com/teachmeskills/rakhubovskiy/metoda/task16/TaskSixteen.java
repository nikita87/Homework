package com.teachmeskills.rakhubovskiy.metoda.task16;

/*created by Nikita Rakhubovskiy*/

/*Определите сумму элементов одномерного массива, расположенных между
минимальным и максимальным значениями.*/

import java.util.Scanner;

public class TaskSixteen {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Введите любое целое число = ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // заполняем массив
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * n);
            System.out.print(arr[i] + " ");
        }

        int maxIndex = 0;
        int minIndex = 0;
        int sum = 0;
        int i;

        //находим максимальный и минимальный элемент массива
        //присваиваем max и min номер индекса соответствующего элемента
        for (i = 0; i < arr.length; i++) {
            if (arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }
            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            }
        }
        System.out.println("\n" + "minElem = " + arr[minIndex] + "\n" +"maxElem = "+ arr[maxIndex]);

        // меняем местами индексы min и max элементов, если min стоит дальше max
        if (minIndex > maxIndex){
            i = minIndex;
            minIndex = maxIndex;
            maxIndex = i;
        }
        // суммируем значения элементов между min и max
        for (i = minIndex + 1 ; i < maxIndex; i++) {
            sum += arr[i];
        }
        System.out.println("sum = " + sum);

        sc.close();
    }
}
