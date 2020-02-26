package com.teachmeskills.rakhubovskiy.metoda.task2;

import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Input your name:");

        String name = sc.nextLine();

        System.out.println("Hello, " + name + "!");

        sc.close();
    }
}
