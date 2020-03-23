package com.teachmeskills.rakhubovskiy.metoda.lesson8.interfacehomework.doptask2;

/*Интерфейсы:
- Куртка
- Штаны
- Обувь
в каждом интерфейсе есть 2 метода (надеть и снять)
Делаем несколько реализации каждого интерфейса.
Создаём класс человек:
У человека поля:
-имя
-куртка
-штаны
-обувь
У человека есть 2 метода:
- одеться(вызываются методы надеть у всех вещей)
- раздеться (вызываются методы снять у всех вещей)
*/

import com.teachmeskills.rakhubovskiy.metoda.lesson8.interfacehomework.doptask2.jacket.JacketSummer;
import com.teachmeskills.rakhubovskiy.metoda.lesson8.interfacehomework.doptask2.jacket.JacketWinter;
import com.teachmeskills.rakhubovskiy.metoda.lesson8.interfacehomework.doptask2.pants.PantsSummer;
import com.teachmeskills.rakhubovskiy.metoda.lesson8.interfacehomework.doptask2.pants.PantsWinter;
import com.teachmeskills.rakhubovskiy.metoda.lesson8.interfacehomework.doptask2.shoes.ShoesSummer;
import com.teachmeskills.rakhubovskiy.metoda.lesson8.interfacehomework.doptask2.shoes.ShoesWinter;

public class Run {
    public static void main(String[] args) {

        JacketSummer jacketSummer = new JacketSummer("summer");
        JacketWinter jacketWinter = new JacketWinter("winter");

        PantsSummer pantsSummer = new PantsSummer("summer");
        PantsWinter pantsWinter = new PantsWinter("winter");

        ShoesSummer shoesSummer = new ShoesSummer("summer");
        ShoesWinter shoesWinter = new ShoesWinter("winter");

        Man ivan = new Man("Иван", pantsSummer, jacketSummer, shoesSummer);
        Man petr = new Man("Петр", pantsWinter, jacketWinter, shoesWinter);

        System.out.println(ivan.getName());
        ivan.putOn();
        ivan.takeOff();
        System.out.println("*****************************");
        System.out.println(petr.getName());
        petr.putOn();
        petr.takeOff();

    }
}
