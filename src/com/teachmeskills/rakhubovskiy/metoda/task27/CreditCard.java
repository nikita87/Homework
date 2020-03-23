package  com.teachmeskills.rakhubovskiy.metoda.task27;

public class CreditCard extends BankingCard {

    private String nameHolderCreditCard;
    private String surnameHolderCreditCard;

    public CreditCard(String nameOfBank, Long numberOfCard, Integer termOfValidity, String nameHolderCreditCard, String surnameHolderCreditCard) {
        super(nameOfBank, numberOfCard, termOfValidity);
        this.nameHolderCreditCard = nameHolderCreditCard;
        this.surnameHolderCreditCard = surnameHolderCreditCard;
    }

    public CreditCard() {
    }

    public String getNameHolderCreditCard() {
        return nameHolderCreditCard;
    }

    public void setNameHolderCreditCard(String nameHolderCreditCard) {
        this.nameHolderCreditCard = nameHolderCreditCard;
    }

    public String getSurnameHolderCreditCard() {
        return surnameHolderCreditCard;
    }

    public void setSurnameHolderCreditCard(String surnameHolderCreditCard) {
        this.surnameHolderCreditCard = surnameHolderCreditCard;
    }


}
