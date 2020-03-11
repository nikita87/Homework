package com.teachmeskills.rakhubovskiy.metoda.task21;

/*Напишите три цикла выполняющих многократное сложение строк, один с
помощью оператора сложения и String, другой с помощью StringBuilder и метода
append, а также аналогино для StringBuffer. Сравните скорость их выполнения.*/

public class TaskTwentyOne {
    public static void main(String[] args) {

        //цикл, выполняющий сложение строк с помощью оператора сложения и String
        String str = "name";
        String name = "John";

        long startTime = System.nanoTime();

        for(int i = 0; i <= 5; i++){
         str += name ;
            System.out.println(str);
        }

        long endTime = System.nanoTime();
        long delta = endTime - startTime;

        System.out.println("Execution time (String && +): " + delta + " ns");

        System.out.println("**************************************");

        //цикл, выполняющий сложение строк с помощью StringBuilder
        StringBuilder sb = new StringBuilder("name:");

        startTime = System.nanoTime();

        for(int i = 0; i <= 5; i++){
            sb = sb.append(name);
            System.out.println(sb);
        }

        endTime = System.nanoTime();
        delta = endTime - startTime;

        System.out.println("Execution time (StringBuilder): " + delta + " ns");

        System.out.println("****************************************");

        //цикл, выполняющий сложение строк с помощью StringBuffer
        StringBuffer sbf = new StringBuffer("name:");

        startTime = System.nanoTime();

        for(int i = 0; i <= 5; i++){
            sbf = sbf.append(name);
            System.out.println(sbf);
        }

        endTime = System.nanoTime();
        delta = endTime - startTime;

        System.out.println("Execution time (StringBuffer): " + delta + " ns");
    }
}
