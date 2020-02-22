package com.teachmeskills.rakhubovskiy.metoda.task17;

/*created by Nikita Rakhubovskiy*/

/*Создать двухмерный квадратный массив, и заполнить его «бабочкой», т.е
таким образом:
11111
01110
00100
01110
11111*/

public class TaskSeventeen {
    public static void main (String[] args){

        int[][] butterfly = new int[5][5];

        for (int i = 0; i < butterfly.length; i++){
            for (int j = i; j < butterfly[i].length - i; j++){
                butterfly[i][j] = 1;
            }
        }

        for (int i = butterfly.length - 1; i > 0; i--){
            for (int j = i; j >= butterfly[i].length - i - 1; j--){
                butterfly[i][j] = 1;
            }
        }

        for (int i = 0; i < butterfly.length; i++){
            for (int j = 0; j < butterfly[i].length; j++){
                System.out.print(butterfly[i][j] + "\t");
            }
            System.out.println(" ");
        }
    }
}
