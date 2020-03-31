package com.teachmeskills.rakhubovskiy.metoda.lesson12.doptask2;


/*Текстовый файл содержит текст. После запуска программы в другой файл
должны записаться только те предложения в которых от 3-х до 5-ти слов. Если в
предложении присутствует слово-палиндром, то не имеет значения какое кол-во
слов в предложении, оно попадает в новый файл.

Пишем все в ООП стиле. Создаём класс TextFormater
в котором два статических метода:
1. Метод принимает строку и возвращает кол-во слов в строке.
2. Метод принимает строку и проверяет есть ли в строке слово-палиндром. Если
есть возвращает true, если нет false

В main считываем файл.
Разбиваем текст на предложения. Используя методы класса TextFormater
определяем подходит ли нам предложение. Если подходит добавляем его в
новый файл
*/

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws IOException {

        FileReader fileReader;
        try {
            fileReader = new FileReader("fileDopTask2.txt");
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            return;
        }

        FileWriter fileWriter;
        fileWriter = new FileWriter("fileDopTask2New.txt");

        BufferedWriter bw = new BufferedWriter(fileWriter);
        BufferedReader br = new BufferedReader(fileReader);

        String line;
        int countWordsInLine;
        boolean isPalindromInLine;

        while ((line = br.readLine()) != null) {
            Matcher matcher = Pattern.compile("[^.!?]+[.!?]").matcher(line);
            while (matcher.find()) {
                String str = matcher.group().trim();
                countWordsInLine = TextFormatter.getCountWordsLine(str);
                isPalindromInLine = TextFormatter.getLineWithPalindrom(str);
                if (((countWordsInLine >= 3) && (countWordsInLine <= 5)) || (isPalindromInLine == true)){
                    bw.write(str + "\n");
                }
            }
        }

        bw.flush();
        fileReader.close();
        fileWriter.close();
    }
}




