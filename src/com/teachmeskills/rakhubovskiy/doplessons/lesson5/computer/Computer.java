package com.teachmeskills.rakhubovskiy.doplessons.lesson5.computer;

import java.util.Random;

public class Computer {

    private Double cpu;
    private Double ram;
    private Integer hdd;
    private Integer workResource;

    public Computer (Double cpu, Double ram, Integer hdd, Integer workResource){
        this.cpu = cpu;
        this.ram = ram;
        this.hdd = hdd;
        this.workResource = workResource;
    }

    public void description(){
        System.out.println("CPU " + cpu + " GHz");
        System.out.println("RAM " + ram + " Gb");
        System.out.println("HDD " + hdd + " Gb");
        System.out.println("Work resource = " + workResource + " cycles");
    }

    public Integer turnOn() {
        Random random = new Random();
        int compCommand = random.nextInt(2);

        if (compCommand == 1) {
            System.out.println("Computer TURN ON");
            return 1;
        } else {
            System.out.print("\n" + "TurnOnError! Input 0 or 1:");
            return 0;
        }
    }

    public Integer userTurnOn(int userCommand) {
        Random random = new Random();
        int compCommand = random.nextInt(2);

        if (compCommand == userCommand) {
            System.out.println("Computer TURN ON");
            return 1;
        } else {
            System.out.print("\n" + "Computer is break!");
            return 0;
        }
    }

    public Integer turnOff() {
        Random random = new Random();
        int compCommand = random.nextInt(2);

        if (compCommand == 1) {
            System.out.println("Computer TURN OFF");
            return 1;
        } else {
            System.out.print("\n" + "TurnOffError! Input 0 or 1:");
            return 0;
        }
    }

    public Integer userTurnOff(int userCommand) {
        Random random = new Random();
        int compCommand = random.nextInt(2);

        if(compCommand == userCommand){
            System.out.println("Computer TURN OFF");
            return 1;
        } else {
            System.out.print("\n" + "Computer is break!");
            return 0;
        }
    }

    public void resourceCalculation(double useResource){
        if (useResource < 0){
            System.out.println("Work limit exceeded! Computer is break!");
        }
    }

    public Integer getWorkResource() {
        return workResource;
    }
}


