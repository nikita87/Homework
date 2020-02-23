package com.teachmeskills.rakhubovskiy.metoda.task20;

/*Имеется строка с текстом. Вывести текст, составленный из последних букв
всех слов.*/

public class TaskTwenty {

    public static void main(String[] args) {

        String str = "Строковый литерал — это последовательность символов, заключенных в двойные кавычки.";

        String[] words = str.trim().split("\\s");

        for (int i = 0; i < words.length; i++){
            char[] wordInLetter = words[i].toCharArray();
            for (int j = 0; j < wordInLetter.length; j++){
                if (wordInLetter[j] != '—') {
                    if ((wordInLetter[wordInLetter.length - 1] != ',') && (wordInLetter[wordInLetter.length - 1] != '.')) {
                        char lastLetterOfWord = wordInLetter[wordInLetter.length - 1];
                        System.out.print(lastLetterOfWord);
                    }
                    break;
                }
            }
        }
    }
}
