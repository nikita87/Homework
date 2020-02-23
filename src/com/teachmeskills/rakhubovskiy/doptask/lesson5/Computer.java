package com.teachmeskills.rakhubovskiy.doptask.lesson5;

import java.util.Random;

public class Computer {

    private String cpu = "3.30"; //процессор
    private String ram = "4.00"; //оперативка
    private String hdd = "250";  //жесткий диск
    private Integer workResource = 100;//ресурс работы (количество циклов вкл/выкл)

    public void description(){
        System.out.println("CPU: " + cpu + " GHz");
        System.out.println("RAM: " + ram + " Gb");
        System.out.println("HDD: " + hdd + " Gb");
        System.out.println("Work resource: " + workResource + " cycles");
    }

    public Integer turnOn(int userCommand) {
        Random random = new Random();
        int compCommand = random.nextInt(2);

        if (compCommand == userCommand){
            System.out.println("computer TURN OFF");
            return 1;
        }
        else if (compCommand != userCommand){
            System.out.println("computer is break. It's end!");
            return 0;
        }

        return null;
    }

    public Integer turnOff(int userCommand){
        Random random = new Random();
        int compCommand = random.nextInt(2);

        if (compCommand == userCommand){
            System.out.println("computer TURN ON");
            return 0;
        }
        else if (compCommand != userCommand){
            System.out.println("computer is break.It's end!");
            return 1;
        }

        return null;
    }

    public Integer resourceCalculation(int cycleNumber) {

        if ((cycleNumber/2) > workResource)
            System.out.println("Computer is break! Work resource is finish.");

        return cycleNumber;
    }
}
