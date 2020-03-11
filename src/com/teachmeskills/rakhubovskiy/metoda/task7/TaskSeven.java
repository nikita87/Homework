package com.teachmeskills.rakhubovskiy.metoda.task7;

/*created by Nikita Rakhubovskiy*/

/*Имеется прямоугольное отверстие размерами a и b, определить, можно ли его
полностью закрыть круглой картонкой радиусом r.*/

import java.util.Scanner;

public class TaskSeven {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите размеры прямоугольного отверстия:");

        System.out.print("a = ");
        double a = sc.nextDouble();

        System.out.print("b = ");
        double b = sc.nextDouble();

        System.out.println("Введите радиус круглой картонки:");

        System.out.print("r = ");
        double r = sc.nextDouble();

        double lengthDiagonal = Math.sqrt(a*a + b*b);// находим длину диагонали прямоугольника

        if (r >= lengthDiagonal/2) {
            System.out.println("Круглой картонкой можно полностью закрыть данное прямоугольное отверстие");
        } else {
            System.out.println("Круглой картонкой нельзя полностью закрыть данное прямоугольное отверстие");
        }

        sc.close();
    }

}