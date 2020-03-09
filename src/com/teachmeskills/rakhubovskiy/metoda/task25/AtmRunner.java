package com.teachmeskills.rakhubovskiy.metoda.task25;

import java.util.Scanner;

public class AtmRunner {
    public static void main(String[] args) {

        Atm atm = new Atm(10, 20, 50);

        Scanner sc = new Scanner(System.in);

        System.out.println("Input amount of money:");
        String needSumStr = sc.nextLine(); //сумма денег для снятия
        int needSum = Integer.parseInt(needSumStr);

        boolean b = atm.checkCash(needSum); //проверка необходимой суммы в банкомате

        if (b == true){
            atm.getCash(needSum);
        }

        atm.addCash(100, 10);
        atm.addCash(20,30);
        atm.addCash(50, 20);

        sc.close();
    }

}



