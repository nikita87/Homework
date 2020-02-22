package com.teachmeskills.rakhubovskiy.metoda.task9;

/*created by Nikita Rakhubovskiy*/

/* Изменить пример с суммой чисел таким образом, чтобы рассчитывалась не сумма, а
произведение, т.е. факториал числа.*/

public class TaskNine {
    public static void main(String[] args) {

        int fact = 1; //переменная содержит произведение чисел(факториал)
        int n = 0;
        int x = (int)(Math.random()*10);//задается рандомное число

        while (x != 0){
            fact *= x;
            x--;
            n++;
        }

        if (n != 0) {
            System.out.println("факториал" + n + " = " + fact);
        } else {
            System.out.println("факториал" + n + " = 1");
        }
    }
}
