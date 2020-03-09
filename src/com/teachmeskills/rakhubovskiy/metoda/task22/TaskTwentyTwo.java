package com.teachmeskills.rakhubovskiy.metoda.task22;

/*Написать программу, выполняющую поиск в строке шестнадцатеричных чисел,
записаных по правилам Java, с помощью регулярных выражений и вывести их на
страницу.*/

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskTwentyTwo {
    public static void main (String[] args){

        String str = "0x7FAB khjy 0x7AAF 0x4EA rtrf 0x1490C dgdfgr";

        Pattern pat = Pattern.compile("0x\\p{XDigit}+");
        Matcher mat = pat.matcher(str);

        while (mat.find()){//ищем заданные выражения
            System.out.println(mat.group());
        }
    }
}
