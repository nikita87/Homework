package com.teachmeskills.rakhubovskiy.doplessons.lesson3.doptask7;

/*created by Nikita Rakhubovskiy*/

/*Напишите программу, определяющую сумму всех нечетных чисел от 1 до 99*/

public class DopTaskSeven {

    public static void main(String[] args) {

        int sumOddNumber = 0;

        for (int i = 1; i <= 99; i++){
            if (i % 2 != 0){
                sumOddNumber += i;
                System.out.print(i + " ");
            }
        }
        System.out.println("\n" + "сумма = " + sumOddNumber);
    }
}
