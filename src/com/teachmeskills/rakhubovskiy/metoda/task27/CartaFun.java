package  com.teachmeskills.rakhubovskiy.metoda.task27;

public class CartaFun extends CreditCard {

    private String kindOfChargeSystem;

    public CartaFun(String nameOfBank, Long numberOfCard, Integer termOfValidity, String nameHolderCreditCard, String surnameHolderCreditCard, String kindOfChargeSystem) {
        super(nameOfBank, numberOfCard, termOfValidity, nameHolderCreditCard, surnameHolderCreditCard);
        this.kindOfChargeSystem = kindOfChargeSystem;
    }

    public CartaFun() {
    }

    public String getKindOfChargeSystem() {
        return kindOfChargeSystem;
    }

    public void setKindOfChargeSystem(String kindOfChargeSystem) {
        this.kindOfChargeSystem = kindOfChargeSystem;
    }

    public void showBalance(){
        System.out.println("Ваш баланс!");
    }

    @Override
    public String toString() {
        return "CartaFun{" +
                "kindOfChargeSystem='" + kindOfChargeSystem + '\'' +
                '}';
    }
}
