package com.teachmeskills.rakhubovskiy.doptask.lesson5;

import java.util.Scanner;

public class ComputerMain {
    public static void main(String[] args) {

        Computer computer = new Computer();
        computer.description();

        System.out.print("\n" + "Input command 0 or 1: ");

        Scanner sc = new Scanner(System.in);

        String inputStrOn = sc.nextLine();
        int userCommand = Integer.parseInt(inputStrOn);

        int cycleNumber = 0;

        int j = computer.turnOn(userCommand);

        if (j == 1) {
            cycleNumber++;
            System.out.print("\n" + "Input command 0 or 1: ");
            String inputStrOff = sc.nextLine();
            userCommand = Integer.parseInt(inputStrOff);
            int i = computer.turnOff(userCommand);
            if (i == 0) {
                cycleNumber++;
            }
        }

        computer.resourceCalculation(cycleNumber);

        sc.close();

    }
}
