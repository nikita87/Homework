package com.teachmeskills.rakhubovskiy.metoda.task3;

/*created by Nikita Rakhubovskiy*/
/*Имеется 4500 секунд. Вывести в консоль содержащихся в этом количестве секунд:
        А) минут + секунд,
        В) часов + минут + секунд,
        С) дней + часов + минут + секунд,
        D) недель + дней + часов + минут + секунд.*/

public class TaskThree {

    public static void main (String[] args){

        int s = 4500; //кол-во полных секунд

        int sec = s % 60; //остаток секунд

        int m = (s - sec)/60; //кол-во полных минут

        int min = m % 60; //остаток минут

        int h = (m - min)/60; //кол-во полных часов

        int hour = h % 24; //остаток часов

        int d = (h - hour)/24; //кол-во полных дней

        int days = d % 7; //остаток дней

        int w = (d - days)/7; //кол-во полных дней

        System.out.println(m + " минут " + sec + " секунд");
        System.out.println(h + " часов " + min + " минут " + sec + " секунд");
        System.out.println(d + " дней " + hour + " часов " + min + " минут " + sec + " секунд");
        System.out.println(w + " недель " + days + " дней " + hour + " часов " + min + " минут " + sec + " секунд");
    }
}


