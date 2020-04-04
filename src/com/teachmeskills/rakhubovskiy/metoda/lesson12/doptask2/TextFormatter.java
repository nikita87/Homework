package com.teachmeskills.rakhubovskiy.metoda.lesson12.doptask2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextFormatter {

    public static int getCountWordsLine(String str){
        str = str.replaceAll("[^a-zA-Zа-яА-Я-]", " ");
        int words = str.split("\\s+").length;

        return words;
    }

    public static boolean getLineWithPalindrom(String str) {
        str = str.replaceAll("[^a-zA-Zа-яА-Я]", " ");
        String[] words = str.trim().split("\\s+");
        for (int i = 0; i < words.length; i++) {
            int count = 0;
            char[] letterInWord = words[i].toCharArray();
            for (int j = 0; j < letterInWord.length / 2; j++) {
                if (letterInWord[j] != letterInWord[letterInWord.length - j - 1]) {
                    break;
                }
                count++;
            }
            if (count == letterInWord.length / 2) {
                return true;
            }
        }
        return false;
    }
}

