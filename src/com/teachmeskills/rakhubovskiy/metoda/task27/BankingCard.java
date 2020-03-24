package  com.teachmeskills.rakhubovskiy.metoda.task27;/*created by Nikita Rakhubovskiy*/

/*Создать иерархию классов, описывающих банковские карточки.
  Иерархия должна иметь хотя бы три уровня.*/

public class BankingCard {

    private String nameOfBank;
    private Long numberOfCard;
    private Integer termOfValidity;

    public BankingCard(String nameOfBank, Long numberOfCard, Integer termOfValidity) {
        this.nameOfBank = nameOfBank;
        this.numberOfCard = numberOfCard;
        this.termOfValidity = termOfValidity;
    }

    public BankingCard(){
    }

    public String getNameOfBank() {
        return nameOfBank;
    }

    public void setNameOfBank(String nameOfBank) {
        this.nameOfBank = nameOfBank;
    }

    public Long getNumberOfCard() {
        return numberOfCard;
    }

    public void setNumberOfCard(Long numberOfCard) {
        this.numberOfCard = numberOfCard;
    }

    public Integer getTermOfValidity() {
        return termOfValidity;
    }

    public void setTermOfValidity(Integer termOfValidity) {
        this.termOfValidity = termOfValidity;
    }
}
