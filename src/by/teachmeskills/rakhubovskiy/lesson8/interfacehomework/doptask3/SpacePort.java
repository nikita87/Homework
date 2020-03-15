package by.teachmeskills.rakhubovskiy.lesson8.interfacehomework.doptask3;

public class SpacePort {

    public void launch(IStart startObj) {

        System.out.println("Предстартовая проверка систем запуска...");

        boolean launchCheckCode = startObj.preLaunchSystemCheck();

        if (launchCheckCode == false){
            System.out.println("Предстартовая проверка провалена! Запуск не удался.");
        } else {
            System.out.println("Предстартовая проверка прошла успешно!");
            startObj.engineStart();
            System.out.println("Пошел обратный отсчет:");
            for (int i = 10; i > 0; i--){
                System.out.println(i);
            }
            startObj.start();
        }
    }
}
