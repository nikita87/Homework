package com.teachmeskills.rakhubovskiy.metoda.task19;

/*created by Nikita Rakhubovskiy*/

/*Имеется строка с текстом. Подсчитать количество слов в тексте. Желательно
учесть, что слова могут разделяться несколькими пробелами, в начале и конце
текста также могут быть пробелы, но могут и отсутствовать.*/

public class TaskNineteen {
    public static void main(String[] args) {

        String str = "Строковый литерал — это последовательность символов, заключенных в двойные кавычки.";

        String[] words = str.trim().split("\\s");

        int countWords = 0;

        for (int i = 0; i < words.length; i++){
            if (!words[i].equals("—") && !words[i].equals("-")){
                countWords++;
            }
        }
        System.out.println(str);
        System.out.println("\n" + "количество слов в строке = " + countWords);
    }
}
