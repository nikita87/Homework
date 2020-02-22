package com.teachmeskills.rakhubovskiy.metoda.task8;

/*created by Nikita Rakhubovskiy*/

/* Имеется целове число (задать с помощью Random rand = new Random(); int x =
rand.nextInt() ). Это число – количесво денег в рублях. Вывести это число, добавив к
нему слово «рублей» в правильном падеже.*/

import java.util.Random;

public class TaskEight {
    public static void main(String[] args) {

        Random rand = new Random();
        int x = rand.nextInt(10000);

        switch (x % 100){ //определяем две последние цифры числа (11...14)
            case 11:
            case 12:
            case 13:
            case 14:
                System.out.println(x + " рублей");
                break;
            default:
            switch (x % 10){ //определяем последнюю цифру числа (0...9)
                case 1:
                    System.out.println(x + " рубль");
                    break;
                case 2:
                case 3:
                case 4:
                    System.out.println(x + " рубля");
                    break;
                default:
                    System.out.println(x + " рублей");
            }
        }
    }
}

