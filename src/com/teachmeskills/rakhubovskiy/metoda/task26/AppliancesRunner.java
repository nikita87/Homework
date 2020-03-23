package  com.teachmeskills.rakhubovskiy.metoda.task26;

/*created by Nikita Rakhubovskiy*/

/*
Создать иерархию классов, описывающих бытовую технику. Создать несколько
объектов описанных классов, часть из них включить в розетку.
Иерархия должна иметь хотя бы три уровня.
*/


public class AppliancesRunner {
    public static void main(String[] args) {

        Refrigerator refrigerator = new Refrigerator("LG", 65.5, 59.5,190.7,0.79, "встраиваемый", "с морозильником", "двухдверный");
        VacuumCleaner vacuumCleaner = new VacuumCleaner("Samsung", 39.5,28.0,23.8,1.6,"переносной","пылесос");
        AirConditioner airConditioner = new AirConditioner("Electrolux", 32.0,54.0,78.2,2.5,"настенный", "сплит-система", "настенный");

        refrigerator.turnOn();
        refrigerator.function();

        System.out.println("**************************");

        vacuumCleaner.turnOn();
        vacuumCleaner.function();

        System.out.println("**************************");

        airConditioner.turnOn();
        airConditioner.function();
    }
}
