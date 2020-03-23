package  com.teachmeskills.rakhubovskiy.metoda.task27;

public class StatusDebitCard extends DebitCard {

    private String kindOfChargeSystem;

    public StatusDebitCard(String nameOfBank, Long numberOfCard, Integer termOfValidity, String nameHolderDebitCard, String surnameHolderDebitCard, String kindOfChargeSystem) {
        super(nameOfBank, numberOfCard, termOfValidity, nameHolderDebitCard, surnameHolderDebitCard);
        this.kindOfChargeSystem = kindOfChargeSystem;
    }

    public StatusDebitCard() {
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
        return "StatusDebitCard{" +
                "kindOfChargeSystem='" + kindOfChargeSystem + '\'' +
                '}';
    }
}
