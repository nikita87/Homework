package  com.teachmeskills.rakhubovskiy.metoda.task30;

import java.util.*;

/*Создать коллекцию, наполнить ее случайными числами. Удалить повторяющиеся
числа.*/

public class TaskThirty {
    public static void main(String[] args) {

        Random rand = new Random();
        int sizeList = rand.nextInt(20) + 1;

        List<Integer> numberList = new ArrayList<>();
        for (int i = 0; i < sizeList; i++){
            int numberGen = (int) (Math.random()*20);
            numberList.add(numberGen);
        }
        System.out.println("Исходный список = " + numberList.toString());

        //удаляем все дубликаты из списка
        Set<Integer> numberSet = new HashSet<>();
        for (int i = 0; i < numberList.size(); i++){
            numberSet.add(numberList.get(i));
        }
        System.out.println("Список с уникальными числами = " + numberSet.toString());
    }
}
