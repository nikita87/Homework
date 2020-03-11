package com.teachmeskills.rakhubovskiy.metoda.task18;

/*created by Nikita Rakhubovskiy*/

/*Найти в строке не только запятые, но и другие знаки препинания. Подсчитать
общее их количество.*/

public class TaskEighteen {
    public static void main(String[] args) {

        String str = "Строковый литерал — это последовательность символов, заключенных в двойные кавычки.";

        int number = 0;
        char ch;

        for (int i = 0; i < str.length(); i++){
            ch = str.charAt(i);
            if (ch ==',' || ch == '.' || ch == '—'){
                number++;
            }
        }
        System.out.println(str);
        System.out.println("Общее число знаков препинания в строке = " + number);
    }
}
