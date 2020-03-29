package com.teachmeskills.rakhubovskiy.metoda.task36;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/*Вывести список файлов и каталогов выбранного каталога на диске. Файлы и каталоги
должны быть распечатаны отдельно.*/

public class TaskThirtySix {
    public static void main(String[] args) {

        File dir = new File("f://Учеба");

        List<String> folderList = new ArrayList<>();
        List<String> fileList = new ArrayList<>();

        if (dir.isDirectory()){
            for (File item: dir.listFiles()) {
                if (item.isDirectory()){
                    folderList.add(item.getName() + "\n");
                } else {
                    fileList.add(item.getName() + "\n");
                }
            }
        }
        System.out.println("Список каталогов:" + "\n" + folderList);
        System.out.println("Список файлов:" + "\n" + fileList);
    }
}
