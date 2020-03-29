package com.teachmeskills.rakhubovskiy.metoda.task35;

/*Записать в двоичный файл 20 случайных чисел. Прочитать записанный файл,
распечатать числа и их среднее арифметическое.*/

import java.io.*;
import java.util.Random;

public class TaskThirtyFive {
    public static void main(String[] args) throws IOException {

        DataOutputStream dos;
        DataInputStream dis;

        //создаем файл и заполняем его случайными числами
        try {
            dos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("fileTask35.dat")));
        } catch (FileNotFoundException e) {
            System.out.print("File not found");
            return;
        }

        Random rand = new Random();

        for (int i = 0; i < 20; i++){
            int randomNumber = rand.nextInt(100);
            dos.writeInt(randomNumber);
        }

        dos.close();

        //читаем содержимое файла
        try {
            dis = new DataInputStream(new BufferedInputStream(new FileInputStream("fileTask35.dat")));
        } catch (FileNotFoundException e){
            System.out.print("File not found");
            return;
        }

        int sum = 0;
        int count = 0;
        int res = dis.readInt();

        while (true){
            System.out.println(res);
            sum += res;
            count++;
            try{
                res = dis.readInt();
            } catch (EOFException e){
                break;
            }
        }

        double average = sum/count;

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);

        if (dis != null){
            dis.close();
        }
    }
}
