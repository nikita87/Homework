package com.teachmeskills.rakhubovskiy.metoda.task19;

/*Имеется строка с текстом. Подсчитать количество слов в тексте. Желательно
учесть, что слова могут разделяться несколькими пробелами, в начале и конце
текста также могут быть пробелы, но могут и отсутствовать.*/

public class TaskNineteen {
    public static void main(String[] args) {

        String str = "Строковый литерал — это последовательность символов, заключенных в двойные кавычки.";

        int countWords = 0;

        String[] words = str.trim().split("\\s");

        for (int i = 0; i < words.length; i++){
            if ((!words[i].equals("—")) && (!words[i].equals("-"))){
            countWords++;
            }
        }
        System.out.println("Число слов в строке = " + countWords);
    }
}
