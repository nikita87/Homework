package com.teachmeskills.rakhubovskiy.doplessons.lesson3.doptask6;

/*created by Nikita Rakhubovskiy*/

/*Напишите программу вывода всех четных чисел от 2 до 100 включительно*/

public class DopTaskSix {

    public static void main(String[] args) {

        System.out.println("Все четные числа от 2 до 100:");

        for (int i = 2; i <= 100; i++){
            if (i % 2 == 0){
                System.out.print(i + " ");
            }
        }
    }
}
