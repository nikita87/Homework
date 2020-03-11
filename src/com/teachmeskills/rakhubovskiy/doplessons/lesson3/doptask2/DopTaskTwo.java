package com.teachmeskills.rakhubovskiy.doplessons.lesson3.doptask2;

/*created by Nikita Rakhubovskiy*/

/*Одноклеточная амеба каждые 3 часа делится на 2 клетки. Определить,сколько амеб будет через 3, 6, 9, 12,..., 24 часа.*/

public class DopTaskTwo {

    public static final int T = 3; //период деления клетки равный 3 часам
    public static final int TIME = 24; //время в часах
    public static final int D = 2; //количество клеток после деления
    public static final int NUMBER_TO_DIV = 1; //количество амеб до деления

    public static void main (String[] args){

        int number;
        int p = 0;

        for (int i = 0; i <= TIME; i += T){
            number = (int)(NUMBER_TO_DIV * Math.pow(D,p));
            p++;
            System.out.println(i + " ч.: " + number + " шт. ");
        }

    }

}
