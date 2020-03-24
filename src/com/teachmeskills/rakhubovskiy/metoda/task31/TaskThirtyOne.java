package  com.teachmeskills.rakhubovskiy.metoda.task31;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/*Создать список оценок учеников с помощью ArryList, заполнить случайными
оценками. Найти самую высокую оценку с использованием итератора.*/

public class TaskThirtyOne {
    public static void main(String[] args) {

        Random rand = new Random();
        int sizeMarkList = rand.nextInt(20) + 1;

        List<Integer> markList = new ArrayList<>();
        for (int i = 0; i < sizeMarkList; i++){
            int markGen = (int) (Math.random()*10) + 1;
            markList.add(i, markGen);
        }

        System.out.println("Исходный список = " + markList.toString());

        //находим самую высокую оценку в списке
        int max = markList.get(0);
        Iterator iterator = markList.iterator();
        while (iterator.hasNext()){
            int mark = (int) iterator.next();
            if (mark > max){
                max = mark;
            }
        }
        System.out.println("Самая высокая оценка списка = " + max);
    }
}
