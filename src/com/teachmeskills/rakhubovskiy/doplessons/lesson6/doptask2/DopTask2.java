package com.teachmeskills.rakhubovskiy.doplessons.lesson6.doptask2;

//Заменить все вхождения символа стоящего в позиции 3 на символ стоящий в позиции 0

public class DopTask2 {
    public static void main(String[] args) {

        String str = "Класс - это шаблон создаваемого по его описанию объекта";

        char[] arr = str.toCharArray();
        char ch1 = str.charAt(0);
        char ch2 = str.charAt(3);

        for (int i = 0; i < str.length(); i++){
            if (arr[i] == ch2){
                arr[i] = ch1;
            }
        }

        System.out.println(str);
        System.out.printf("Символ '%s' заменить на '%s'", ch2, ch1);
        System.out.println(" ");
        System.out.print(arr);
    }
}
