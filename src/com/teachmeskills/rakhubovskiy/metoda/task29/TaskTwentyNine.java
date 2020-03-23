package  com.teachmeskills.rakhubovskiy.metoda.task29;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*Создать список оценок учеников с помощью ArrayList, заполнить случайными
оценками. Удалить неудовлетворительные оценки из списка.*/

public class TaskTwentyNine {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите количество оценок:");
        String markStr = sc.nextLine();
        int mark = Integer.parseInt(markStr);

        List<Integer> markList = new ArrayList<>();
        for (int i = 0; i < mark; i++){
            int markGen = (int) (Math.random()*10) + 1;
            markList.add(i, markGen);
        }

        System.out.println("Исходный список = " + markList.toString());
        //удаляем все неудовлетворительные оценки из списка
        for (int i = 0; i < markList.size(); i++){
            if(markList.get(i) < 4){
                markList.remove(i);
                i--;
            }
        }
        System.out.println("Cписок без неудовлетворительных оценок = " + markList.toString());
        sc.close();
    }
}
