package by.teachmeskills.rakhubovskiy.lesson8.interfacehomework.doptask1;

import by.teachmeskills.rakhubovskiy.lesson8.interfacehomework.doptask1.hands.SamsungHand;
import by.teachmeskills.rakhubovskiy.lesson8.interfacehomework.doptask1.hands.SonyHand;
import by.teachmeskills.rakhubovskiy.lesson8.interfacehomework.doptask1.hands.ToshibaHand;
import by.teachmeskills.rakhubovskiy.lesson8.interfacehomework.doptask1.heads.SamsungHead;
import by.teachmeskills.rakhubovskiy.lesson8.interfacehomework.doptask1.heads.SonyHead;
import by.teachmeskills.rakhubovskiy.lesson8.interfacehomework.doptask1.heads.ToshibaHead;
import by.teachmeskills.rakhubovskiy.lesson8.interfacehomework.doptask1.legs.SamsungLeg;
import by.teachmeskills.rakhubovskiy.lesson8.interfacehomework.doptask1.legs.SonyLeg;
import by.teachmeskills.rakhubovskiy.lesson8.interfacehomework.doptask1.legs.ToshibaLeg;

/*Создать по 3 реализации(Sony, Toshiba, Samsung) каждой запчасти(IHead, IHand, ILeg)
Класс SonyHead является примером реализацией головы от Sony.
Создайте 3 робота с разными комплектующими.
Например у робота голова и нога от Sony а, рука от Samsung.
У всех роботов вызовите метод action.
Среди 3-х роботов найдите самого дорогого.*/

public class Run {
    public static void main(String[] args) {

        SamsungHead samsungHead = new SamsungHead(100);
        SamsungHand samsungHand = new SamsungHand(80);
        SamsungLeg samsungLeg = new SamsungLeg(60);

        SonyHead sonyHead = new SonyHead(90);
        SonyHand sonyHand = new SonyHand(70);
        SonyLeg sonyLeg = new SonyLeg(50);

        ToshibaHead toshibaHead = new ToshibaHead(80);
        ToshibaHand toshibaHand = new ToshibaHand(60);
        ToshibaLeg toshibaLeg = new ToshibaLeg(40);

        Robot robot1 = new Robot(samsungHead, sonyHand, toshibaLeg);
        Robot robot2 = new Robot(sonyHead, toshibaHand, samsungLeg);
        Robot robot3 = new Robot(toshibaHead, samsungHand, sonyLeg);

        robot1.action();
        robot2.action();
        robot3.action();

        if ((robot1.getPrice() > robot2.getPrice()) && (robot1.getPrice() > robot3.getPrice())){
            System.out.println("Робот №1 самый дорогой");
        } else if ((robot2.getPrice() > robot1.getPrice()) && (robot2.getPrice() > robot3.getPrice())){
            System.out.println("Робот №2 самый дорогой");
        } else {
            System.out.println("Робот №3 самый дорогой");
        }
    }
}
