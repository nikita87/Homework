package com.teachmeskills.rakhubovskiy.doptask.lesson2.doptask2;

/*created by Nikita Rakhubovskiy*/

/*Треугольник существует только тогда, когда сумма любых двух его сторон больше третьей. Определить существует ли такой треугольник.
  Дано: a, b, c – стороны предполагаемого треугольника. Требуется сравнить длину каждого отрезка - стороны с суммой двух других.
  Если хотя бы в одном случае отрезок окажется больше суммы двух других, то треугольника с такими сторонами не существует.
*/

import java.util.Scanner;

public class DopTaskTwo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите длины сторон треугольника");

        System.out.print("a = ");
        long a = sc.nextLong();

        System.out.print("b = ");
        long b = sc.nextLong();

        System.out.print("c = ");
        long c = sc.nextLong();

        if (((a + b) > c) && ((b + c) > a) && ((a + c) > b)) {
            System.out.println("Треугольник с такими длинами сторон существует!");
        } else {
            System.out.println("Треугольника с такими длинами сторон не существует!");
        }

        sc.close();
    }
}

