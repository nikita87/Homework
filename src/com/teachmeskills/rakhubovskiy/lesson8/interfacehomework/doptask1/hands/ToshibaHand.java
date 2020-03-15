package by.teachmeskills.rakhubovskiy.doplessons.lesson8.interfacehomework.doptask1.hands;


public class ToshibaHand implements IHand {

    private Integer price;

    public ToshibaHand(Integer price) {
        this.price = price;
    }

    public ToshibaHand() {
    }

    @Override
    public void upHand() {
        System.out.println("Робот поднял руку Toshiba и приветствует");
    }

    @Override
        public int getPrice() {
            return price;
    }
}
