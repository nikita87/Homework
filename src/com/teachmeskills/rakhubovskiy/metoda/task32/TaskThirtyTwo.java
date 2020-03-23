package  com.teachmeskills.rakhubovskiy.metoda.task32;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*Имеется текст. Следует составить для него частотный словарь.*/

public class TaskThirtyTwo {
    public static void main(String[] args) {

        String str = "Частотный словарь - набор слов данного языка(или подъязыка) вместе с информацией о частоте их встречаемости.";

        str = str.replaceAll("[^a-zA-Zа-яА-Я]", " ");
        String[] words = str.trim().split("\\s+");

        Map<String, Integer> wordsMap = new HashMap<>();

        List<String> wordsList = new ArrayList<>();
        for (int i = 0; i < words.length; i++){
            wordsList.add(i, words[i]);
        }

        for(int i = 0; i < wordsList.size(); i++){
            String word = wordsList.get(i);
            if (!wordsMap.containsKey(word)){
                wordsMap.put(word, 1);
            } else {
                wordsMap.put(word, wordsMap.get(word) + 1);
            }
        }

        for(Map.Entry<String, Integer> entry: wordsMap.entrySet()){
            System.out.println("СЛОВО: " + "'" + entry.getKey() + "'" + "; ЧАСТОТА ВСТРЕЧАЕМОСТИ: " + entry.getValue());
        }
    }
}
