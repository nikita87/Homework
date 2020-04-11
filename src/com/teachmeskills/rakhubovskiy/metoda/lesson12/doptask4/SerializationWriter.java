package com.teachmeskills.rakhubovskiy.metoda.lesson12.doptask4;

/* Сеарилизовать объект Автомобиль(Марка, скорость, цена).
   После сериализации произвести обратный процесс
*/

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationWriter {
    public static void main(String[] args) throws IOException {
        Car car = new Car("AudiA4", 300, 30583.0);

        FileOutputStream fos = new FileOutputStream("serialized.dat");
        ObjectOutputStream objectOs = new ObjectOutputStream(fos);

        objectOs.writeObject(car);
        objectOs.close();

    }
}
