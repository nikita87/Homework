package  com.teachmeskills.rakhubovskiy.metoda.task27;

public class FunPlatinum extends CreditCard {

    private String kindOfChargeSystem;

    public FunPlatinum(String nameOfBank, Long numberOfCard, Integer termOfValidity, String nameHolderCreditCard, String surnameHolderCreditCard, String kindOfChargeSystem) {
        super(nameOfBank, numberOfCard, termOfValidity, nameHolderCreditCard, surnameHolderCreditCard);
        this.kindOfChargeSystem = kindOfChargeSystem;
    }

    public FunPlatinum() {
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
        return "FunPlatinum{" +
                "kindOfChargeSystem='" + kindOfChargeSystem + '\'' +
                '}';
    }
}
