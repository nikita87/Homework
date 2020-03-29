package com.teachmeskills.rakhubovskiy.metoda.lesson9;

/*  Придумать и написать собственную аннотацию @Version, которая бует хранить информацию о версии класса сервиса
(поле обязательное) MyService и кодовое название версии (поле не обязательное) - (например номер версии = 7.1, а кодовое название версии = Nougat).
    Класс MyService должен иметь переменные c private модификаторами, конструктор по умолчанию, get и set методы,
переопределенные методы equals и hashcode, а так же private метод (private thisClassInfo), который будет просто печатать данные о самом классе
(данные любые на ваш выбор), в котором он определен.
    Написать программу, которая будет анализировать присутствие аннотации над классом MyService и если она присутствует -
создавать экземпляр этого класса, задавать значения его полям и вызывать метод thisClassInfo (использовать возможности пакета reflection).
*/

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MyAnnotationAnalyzer {

    public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchFieldException, NoSuchMethodException {
        try {
            analyzeClass(MyService.class);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    static void analyzeClass(Class<?> сlazz) throws IllegalAccessException, InstantiationException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException {
        if (сlazz.isAnnotationPresent(Version.class)){

            Object objectClass = сlazz.newInstance();

            Field field = objectClass.getClass().getDeclaredField("field1");
            field.setAccessible(true);
            field.set(objectClass, "value1");

            field = objectClass.getClass().getDeclaredField("field2");
            field.setAccessible(true);
            field.set(objectClass, "value2");

            Method method = objectClass.getClass().getDeclaredMethod("thisClassInfo");
            method.setAccessible(true);
            method.invoke(objectClass);
        }
    }
}
