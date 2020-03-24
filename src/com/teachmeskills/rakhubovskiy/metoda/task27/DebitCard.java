package  com.teachmeskills.rakhubovskiy.metoda.task27;

public class DebitCard extends BankingCard {

    private String nameHolderDebitCard;
    private String surnameHolderDebitCard;

    public DebitCard(String nameOfBank, Long numberOfCard, Integer termOfValidity, String nameHolderDebitCard, String surnameHolderDebitCard) {
        super(nameOfBank, numberOfCard, termOfValidity);
        this.nameHolderDebitCard = nameHolderDebitCard;
        this.surnameHolderDebitCard = surnameHolderDebitCard;
    }

    public DebitCard() {
    }

    public String getNameHolderDebitCard() {
        return nameHolderDebitCard;
    }

    public void setNameHolderDebitCard(String nameHolderDebitCard) {
        this.nameHolderDebitCard = nameHolderDebitCard;
    }

    public String getSurnameHolderDebitCard() {
        return surnameHolderDebitCard;
    }

    public void setSurnameHolderDebitCard(String surnameHolderDebitCard) {
        this.surnameHolderDebitCard = surnameHolderDebitCard;
    }
}
