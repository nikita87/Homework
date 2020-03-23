package  com.teachmeskills.rakhubovskiy.metoda.task30;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*Создать коллекцию, наполнить ее случайными числами. Удалить повторяющиеся
числа.*/

public class TaskThirty {
    public static void main(String[] args) {

        Random rand = new Random();
        int sizeList = rand.nextInt(20) + 1;

        List<Integer> numberList = new ArrayList<>();
        for (int i = 0; i < sizeList; i++){
            int numberGen = (int) (Math.random()*20);
            numberList.add(i, numberGen);
        }
        System.out.println("Исходный список = " + numberList.toString());
        //удаляем все дубликаты из списка
        for (int i = 0; i < numberList.size(); i++){
            for (int j = i + 1; j < numberList.size(); j++){
                if(numberList.get(i) == numberList.get(j)){
                    numberList.remove(j);
                    j--;
                }
            }
        }
        System.out.println("Список с уникальными числами = " + numberList.toString());
    }
}
