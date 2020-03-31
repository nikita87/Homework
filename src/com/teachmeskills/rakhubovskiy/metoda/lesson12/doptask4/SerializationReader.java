package com.teachmeskills.rakhubovskiy.metoda.lesson12.doptask4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class SerializationReader {
    public static void main(String[] args) {

        try {
            FileInputStream fis = new FileInputStream("serialized.dat");
            ObjectInputStream objectIs = new ObjectInputStream(fis);
            Car carFromFile = (Car)objectIs.readObject();
            System.out.println(carFromFile);
            objectIs.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
