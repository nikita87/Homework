package  com.teachmeskills.rakhubovskiy.metoda.task27;

public class ClassicDebitCard extends DebitCard {

    private String kindOfChargeSystem;

    public ClassicDebitCard(String nameOfBank, Long numberOfCard, Integer termOfValidity, String nameHolderDebitCard, String surnameHolderDebitCard, String kindOfChargeSystem) {
        super(nameOfBank, numberOfCard, termOfValidity, nameHolderDebitCard, surnameHolderDebitCard);
        this.kindOfChargeSystem = kindOfChargeSystem;
    }

    public ClassicDebitCard() {
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
        return "ClassicDebitCard{" +
                "kindOfChargeSystem='" + kindOfChargeSystem + '\'' +
                '}';
    }
}
