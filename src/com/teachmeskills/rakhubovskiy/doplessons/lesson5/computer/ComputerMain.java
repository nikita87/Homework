package com.teachmeskills.rakhubovskiy.doplessons.lesson5.computer;

import com.teachmeskills.rakhubovskiy.doplessons.lesson5.computer.Computer;

import java.util.Scanner;

public class ComputerMain {
    public static void main(String[] args) {

        double restResource;
        int countTurnOn, countTurnOff, countTurnOnUser, countTurnOffUser;

        Computer pc = new Computer(3.30, 4.00, 250 , 100);
        pc.description();
        restResource = pc.getWorkResource();

        Scanner sc = new Scanner(System.in);

        while (restResource >= 0) {
            countTurnOn = pc.turnOn();
            if (countTurnOn == 0){
                String userCommandStr = sc.nextLine();
                int userCommand = Integer.parseInt(userCommandStr);
                countTurnOnUser = pc.userTurnOn(userCommand);
                if(countTurnOnUser == 1){
                    restResource = restResource - 0.5;
                } else {
                    break;
                }
            } else {
                restResource = restResource - 0.5;
            }


            if (restResource < 0){
            pc.resourceCalculation(restResource);
            }

            countTurnOff = pc.turnOff();
            if (countTurnOff == 0){
                String userCommandStr = sc.nextLine();
                int userCommand = Integer.parseInt(userCommandStr);
                countTurnOffUser = pc.userTurnOff(userCommand);
                if(countTurnOffUser == 1){
                    restResource = restResource - 0.5;
                } else {
                    break;
                }
            } else {
                restResource = restResource - 0.5;
            }
        }
        sc.close();
    }
}
