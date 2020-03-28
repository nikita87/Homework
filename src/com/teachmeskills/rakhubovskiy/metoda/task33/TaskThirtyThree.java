package com.teachmeskills.rakhubovskiy.metoda.task33;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*Создать файл с текстом, прочитать, подсчитать в тексте количество знаков
препинания и слов.*/

public class TaskThirtyThree {
    public static void main(String[] args) throws IOException {

        FileReader fileReader;
        try {
            fileReader = new FileReader("FileText33.txt");
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            return;
        }

        BufferedReader bfr = new BufferedReader(fileReader);

        String line;

        while ((line = bfr.readLine()) != null){
            System.out.println(line);
            String newLine = line.replaceAll("[a-zA-Z]", " ");
            int pm = newLine.trim().split("\\s+").length;
            System.out.println("Amount of punctuation marks = " + pm);

            line = line.replaceAll("[^a-zA-Z]", " ");
            int words = line.split("\\s+").length;
            System.out.println("Amount of words = " + words);
        }
        fileReader.close();
    }
}
