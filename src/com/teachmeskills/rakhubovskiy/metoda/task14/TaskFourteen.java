package com.teachmeskills.rakhubovskiy.metoda.task14;

/*created by Nikita Rakhubovskiy*/

/*Создать массив оценок произвольной длины, вывести максимальную и
  минимальную оценку, её (их) номера.*/

import java.util.Scanner;

public class TaskFourteen {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Введите любое целое число = ");
        int n = sc.nextInt();

        int[] ratings = new int[n];

        // заполняем массив оценками по 10-ти бальной системе
        for (int i = 0; i < ratings.length; i++) {
            ratings[i] = (int) (Math.random() * 10 + 1);
            System.out.print(ratings[i] + " ");
        }

        int max = ratings[0];
        int min = ratings[0];
        int indexOfMax = 0;
        int indexOfMin = 0;

        // находим максимальную и минимальную оценку и их номер в рейтинге
        for (int i = 0; i < ratings.length; i++) {
            if (ratings[i] > max) {
                max = ratings[i];
                indexOfMax = i;
            }
            if (ratings[i] < min) {
                min = ratings[i];
                indexOfMin = i;
            }
        }

        System.out.println("\n" + "самая высокая оценка = " + max);
        System.out.println("индекс оценки = " + indexOfMax);
        System.out.println("\n" + "самая низкая оценка = " + min);
        System.out.println("индекс оценки = " + indexOfMin);

        sc.close();

    }
}
