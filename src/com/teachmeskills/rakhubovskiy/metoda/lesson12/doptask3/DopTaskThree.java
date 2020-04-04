package com.teachmeskills.rakhubovskiy.metoda.lesson12.doptask3;

/*Проверка на цензуру:
Создаете 2 файла.
1 - й. Содержит исходный текст.
2 - й. Содержит слова недопустимые в тексте(black list). Структура файла
определите сами, хотите каждое слово на новой строке, хотите через запятую
разделяйте, ваша программа делайте как считаете нужным.
    Задача: необходимо проверить проходит ли текст цензуру. Если в тексте не
встретилось ни одного недопустимого слова, то выводите сообщение о том что
текст прошёл проверку на цензуру. Если нет, то выводите соответствуюущее
сообщение, кол-во предложений не прошедших проверку и сами предложения
подлежащие исправлению.
*/

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DopTaskThree {
    public static void main(String[] args) throws IOException {

        FileReader fileReaderText, fileReaderBlackList;

        try (BufferedReader brText = new BufferedReader(fileReaderText = new FileReader("fileDopTask3.txt"))) {

            String lineText, lineBlackList;
            int countBlackListLines = 0;

            while ((lineText = brText.readLine()) != null) {

                boolean isBlackListLine = false;

                String line = lineText.replaceAll("[^a-zA-Z]", " ");
                String[] words = line.trim().split("\\s+");

                for (int i = 0; i < words.length; i++) {

                    try (BufferedReader brBlackList = new BufferedReader(fileReaderBlackList = new FileReader("fileDopTask3_blacklist.txt"))) {

                        while ((lineBlackList = brBlackList.readLine()) != null) {
                            if (words[i].equals(lineBlackList)) {
                                countBlackListLines++;
                                isBlackListLine = true;
                                break;
                            }
                        }

                    } catch (FileNotFoundException e) {
                        System.out.println("Blacklist not found");
                        return;
                    }

                    if (isBlackListLine == true) { //если хотя бы одно слово попадает в blacklist, то сразу выходим из цикла for
                        break;
                    }
                }

                if (isBlackListLine == true) {
                    System.out.println(lineText);
                }
            }

            if (countBlackListLines > 0) {
                System.out.println("\n" + "The text was not censored!");
                System.out.println("Number of uncensored offers: " + countBlackListLines);
            } else {
                System.out.println("Success! The text censored!");
            }

        } catch(FileNotFoundException e){
            System.out.println("File not found");
            return;
        }
    }
}



