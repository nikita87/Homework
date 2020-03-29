package com.teachmeskills.rakhubovskiy.metoda.task20;

/*created by Nikita Rakhubovskiy*/

/*Имеется строка с текстом. Вывести текст, составленный из последних букв
всех слов.*/

public class TaskTwenty {

    public static void main(String[] args) {

        String str = "Строковый литерал — это последовательность символов, заключенных в двойные кавычки.";

        str = str.replaceAll("[^a-zA-Zа-яА-Я]", " ");
        String[] words = str.trim().split("\\s+");

        for (int i = 0; i < words.length; i++){
            char[] letterInWord = words[i].toCharArray();
            for (int j = 0; j <letterInWord.length; j++){
                char lastLetterInWord = letterInWord[letterInWord.length - 1];
                System.out.print(lastLetterInWord);
                break;
            }
        }
    }
}

