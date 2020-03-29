package com.teachmeskills.rakhubovskiy.metoda.task23;

/*Написать программу, выполняющую поиск в строке всех тегов абзацев, в т.ч. тех, у
которых есть параметры, например <p id=”p1”>, и замену их на простые теги
абзацев <p>.*/

public class TaskTwentyThree {
    public static void main(String[] args) {

        String str = "<p id=p1> <p id=p1> wffsw <p id=p1> dsds </p> sdfs";

        System.out.println(str.replaceAll("</p>|<p id=p1>","<p>"));
    }
}
