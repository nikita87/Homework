package com.teachmeskills.rakhubovskiy.metoda.task24;

/*Создать класс и объекты описывающие промежуток времени. Сам промежуток
в классе должен задаваться тремя свойствами: секундами, минутами, часами.
Сделать методы для получения полного количества секунд в объекте, сравнения
двух объектов (метод должен работать аналогично compareTo в строках). Создать
два конструктора: получающий общее количество секунд, и часы, минуты и секунды
по отдельности. Сделать метод для вывода данных.*/

public class TimeIntervalRunner {
    public static void main(String[] args) {

         TimeInterval time1 = new TimeInterval(12040);
         TimeInterval time2 = new TimeInterval(3, 30, 40);

         long totalSeconds1 = time1.getTotalNumberOfSeconds();
         long totalSeconds2 = time2.getTotalNumberOfSeconds();

         int t = time1.compareTimeInterval(totalSeconds2);

         TimeInterval.printInfo(totalSeconds1, totalSeconds2, t);
    }
}
