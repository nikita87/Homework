package com.teachmeskills.rakhubovskiy.metoda.task34;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*Имеется файл с текстом, в котором присутствуют числа. Найти все числа,
распечатать, посчитать сумму, убрать все повторяющиеся числа и снова
распечатать.*/

public class TaskThirtyFour {
    public static void main(String[] args) throws IOException {

        FileReader fileReader;
        try {
            fileReader = new FileReader("FileText34.txt");
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            return;
        }

        BufferedReader bfr = new BufferedReader(fileReader);

        String line;

        Set<Integer> numberSet = new HashSet<>();

        while ((line = bfr.readLine()) != null){
            System.out.println(line);
            line = line.replaceAll("[^0-9]", " ");

            Pattern p = Pattern.compile("\\d+");
            Matcher m = p.matcher(line);

            int sum = 0;

            while (m.find()){
                int number = Integer.parseInt(m.group());
                sum += Integer.parseInt(m.group());
                System.out.print(number + ", ");
                numberSet.add(number); //помещаем в set числа из файла(удаляем дубликаты)
            }
            System.out.println("sum = " + sum);
            System.out.println(numberSet);
        }
        fileReader.close();
    }
}
