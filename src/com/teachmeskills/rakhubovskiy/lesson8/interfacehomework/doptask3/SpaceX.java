package by.teachmeskills.rakhubovskiy.doplessons.lesson8.interfacehomework.doptask3;

import java.util.Random;
import java.util.Scanner;

public class SpaceX implements IStart {
    @Override
    public boolean preLaunchSystemCheck() {
        Random rand = new Random();
        int codeSystem = rand.nextInt(2);

        System.out.println("Включена проверка систем запуска ракеносителля" + "\n" + "Введите проверочный код системы 0 или 1:");
        Scanner sc = new Scanner(System.in);
        String codeCheckControllerStr = sc.nextLine();
        int codeCheckController = Integer.parseInt(codeCheckControllerStr);
        sc.close();

        if (codeCheckController == codeSystem){
            System.out.println("Предстартовая проверка систем запуска ракетоносителя прошла успешно!");
            return true;
        }
        System.out.println("Проверочный код неверный! Предстартовая проверка систем не запустилась!");
        return false;
    }

    @Override
    public void engineStart() {
        System.out.println("Все ступени ракетоносителя запущены!" + "\n" + "Идет набор мощности...");
    }

    @Override
    public void start() {
        System.out.println("Старт ракетоносителя!");
    }
}
