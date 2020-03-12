package com.teachmeskills.rakhubovskiy.doplessons.lesson6.doptask1;

/*Вырезать подстроку из строки начиная с первого вхождения символа на произвольной позиции
до последнего вхождения другого символа на произвольной позиции. Первый символ должен быть
выбран рандомно из первой половины предложения, второй - из второй. Если символы совпадают,
генерировать пары, пока символы не будут различны.*/

public class DopTaskOne {
    public static void main(String[] args) {

        String str = "Класс - это шаблон создаваемого по его описанию объекта";

        int startPos, endPos; //переменные, которые хранят начальный и конечный индекс подстроки
        char chrStartPos, chrEndPos; //переменные, который хранят символы подстроки, соответствующие начальному и конечному индексу

        int lengthStr = str.length();

        do{
            startPos = (int)(Math.random()*(lengthStr/2));
            endPos = (int)(Math.random()*(lengthStr/2)) + lengthStr/2;
            chrStartPos = str.charAt(startPos);
            chrEndPos = str.charAt(endPos);

        } while(chrStartPos == chrEndPos);

        String subStr = str.substring(startPos, endPos);
        System.out.println(subStr);
    }
}
