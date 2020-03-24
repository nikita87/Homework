package com.teachmeskills.rakhubovskiy.metoda.lesson10.shop;

/*
Создать класс Товар, поля:
•id(целое число)
•name(строка)
•price(целое число)

Создать класс Магазин, поля:
•Список товаров (изначально пустой)
методы:
•добавить товар(принимает объект товара и добавляет его в список
товаров). При попытке добавить товар с id уже существующем в списке,
вставка производится не должна
•получить все товары(метод ВОЗВРАЩАЕТ список всех товаров в
магазине)
•удалить товар (метод принимает id товара и удаляет из списка товар с
соответствующим id)
•редактировать товар(принимает объект товара и редактирует им список
товаров)

Обратите внимание что id товара и индекс товара в списке — это разные вещи,
не перепутайте. Id товара — это поле вашего объекта, которое должно автоматически задаваться при создании каждого нового товара и должно быть уникальным (начинаться должно с 1). А индекс товара в списке товаров, это по сути его порядковый номер в
списке(начинается с 0).

В main:
•создаем объект магазина
•создаем пару тройку товаров и добавляем эти товары в магазин
•получаем список товаров из магазина, сортируем по цене(по
возрастанию) и выводим в консоль.
•удаляем один товар
•получаем список товаров из магазина, сортируем по порядку
добавления(последние добавленные в начале) и выводим в консоль.
•редактируем один товар
•получаем список товаров и выводим в консоль
*/

import java.util.Scanner;

public class ShopMain {

    private static Shop myShop = new Shop();
    private static void printMenu(){
        System.out.println("Выберите пункт меню:");
        System.out.println("1 - Добавить товар");
        System.out.println("2 - Показать список товаров");
        System.out.println("3 - Удалить товар");
        System.out.println("4 - Отсортировать список товаров по цене");
        System.out.println("5 - Отсортировать список товаров по порядку добавления");
        System.out.println("6 - Редактировать товар");
        System.out.println("7 - Выход");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean isCheck;

        while(true){
            printMenu();
            String inputStr = sc.nextLine();
            if ((inputStr.equals(null)) || (inputStr.equals(""))) {
                System.out.println("Ошибка!!!Нет такого пункта в меню!");
                break;
            }
            int input = Integer.parseInt(inputStr);

            switch (input){
                case 1:
                    System.out.println("Введите наименование товара:");
                    String nameProductStr = sc.nextLine();
                    if ((nameProductStr.equals(null)) || (nameProductStr.equals(""))) {
                        System.out.println("Ошибка!!!Невозможно добавить товар!");
                        break;
                    }

                    System.out.println("Введите цену товара(ввод в форме 0.0):");
                    String priceStr = sc.nextLine();
                    if ((priceStr.equals(null)) || (priceStr.equals(""))) {
                        System.out.println("Ошибка!!!Невозможно добавить товар!");
                        break;
                    }
                    double price = Double.parseDouble(priceStr);

                    Product product = new Product(nameProductStr, price);
                    myShop.addItem(product);
                    break;
                case 2:
                    myShop.getAllItems();
                    break;
                case 3:
                    System.out.println("Введите id товара:");
                    String idStr = sc.nextLine();
                    if ((idStr.equals(null)) || (idStr.equals(""))) {
                        System.out.println("Ошибка!!!Товара с таким id не найдено!");
                        break;
                    }
                    int id = Integer.parseInt(idStr);

                    isCheck = myShop.checkId(id);
                    if (isCheck == false){
                        System.out.println("Ошибка!!!Товара с таким id не найдено!");
                        break;
                    }

                    myShop.removeItem(id);
                    System.out.println("Товар удален!");
                    break;
                case 4:
                    myShop.sortProductListByPrice();
                    System.out.println("Товара отсортирован по цене!");
                    break;
                case 5:
                    myShop.sortProductListonById();
                    System.out.println("Товара отсортирован в порядке добавления!");
                    break;
                case 6:
                    System.out.println("Введите id товара:");
                    idStr = sc.nextLine();
                    if ((idStr.equals(null)) || (idStr.equals(""))) {
                        System.out.println("Ошибка!!!Товара с таким id не найдено!");
                        break;
                    }
                    id = Integer.parseInt(idStr);

                    isCheck = myShop.checkId(id);
                    if (isCheck == false){
                        System.out.println("Ошибка!!!Товара с таким id не найдено!");
                        break;
                    }

                    System.out.println("Введите наименование товара:");
                    String newNameProductStr = sc.nextLine();
                    if ((newNameProductStr.equals(null)) || (newNameProductStr.equals(""))) {
                        System.out.println("Ошибка!!!Наименование товара неверно!");
                        break;
                    }

                    System.out.println("Введите цену товара(ввод в форме 0.0):");
                    String newPriceStr = sc.nextLine();
                    if ((newPriceStr.equals(null)) || (newPriceStr.equals(""))) {
                        System.out.println("Ошибка!!!Цена товара неверна!");
                        break;
                    }
                    double newPrice = Double.parseDouble(newPriceStr);

                    Product item = myShop.getItemById(id);
                    myShop.editProduct(id, item, newNameProductStr, newPrice);
                    System.out.println("Товар отредактирован!");
                    break;
                case 7:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Ошибка!!!Нет такого пункта в меню!");
                    break;

            }
        }
    }
}
