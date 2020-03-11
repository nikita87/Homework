package com.teachmeskills.rakhubovskiy.metoda.task25;

/*Создать класс и объекты описывающие Банкомат. Набор купюр находящихся в
банкомате должен задаваться тремя свойствами: количеством купюр номиналом 20
50 100. Сделать методы для добавления денег в банкомат. Сделать функцию
снимающую деньги. На вход передается сумма денег. На выход – булевское
значение (операция удалась или нет). При снятии денег функция должна
рапечатывать каким количеством купюр какого номинала выдается сумма. Создать
конструктор с тремя параметрами – количеством купюр.*/

public class Atm {

    private static final Integer AMOUNT_OF_TWENTIES = 500; //емкость банкомата
    private static final Integer AMOUNT_OF_FIFTIES = 200; //емкость банкомата
    private static final Integer AMOUNT_OF_HUNDREDS = 100;//емкость банкомата

    private static final Integer NOM_TWENTY = 20;
    private static final Integer NOM_FIFTY = 50;
    private static final Integer NOM_HUNDRED = 100;

    private Integer amountNom20;
    private Integer amountNom50;
    private Integer amountNom100;

    public Atm(Integer amountNom20, Integer amountNom50, Integer amountNom100) {
        this.amountNom20 = amountNom20;
        this.amountNom50 = amountNom50;
        this.amountNom100 = amountNom100;
    }

    public Integer getAmountNom20() {
        return amountNom20;
    }

    public Integer getAmountNom50() {
        return amountNom50;
    }

    public Integer getAmountNom100() {
        return amountNom100;
    }

    public void setAmountNom20(Integer amountNom20) {
        this.amountNom20 = amountNom20;
    }

    public void setAmountNom50(Integer amountNom50) {
        this.amountNom50 = amountNom50;
    }

    public void setAmountNom100(Integer amountNom100) {
        this.amountNom100 = amountNom100;
    }

    public void addCash(int nominalCash, int amountCash){
        if ((getAmountNom20() + amountCash < AMOUNT_OF_TWENTIES) || (getAmountNom50() + amountCash < AMOUNT_OF_FIFTIES) || (getAmountNom100() + amountCash < AMOUNT_OF_HUNDREDS)){
            switch(nominalCash){
                case 20:
                    amountNom20 = getAmountNom20() + amountCash;
                    break;
                case 50:
                    amountNom50 = getAmountNom50() + amountCash;
                    break;
                case 100:
                    amountNom100 = getAmountNom100() + amountCash;
                    break;
            }
        } else {
            System.out.println("Cannot add cash!");
        }
    }

    public boolean checkCash(int sumCashCustomer){
        int sumCashInAtm = (amountNom20 * NOM_TWENTY) + (amountNom50 * NOM_FIFTY) + (amountNom100 * NOM_HUNDRED);
        if (sumCashInAtm >= sumCashCustomer){
            if (sumCashCustomer % 10 == 0){
                return true;
            }
            System.out.println("Error! The amount of money should be x10!");
            return false;
        } else {
            System.out.println("Error! Not enough money in ATM!");
            return false;
        }
    }

    public void getCash(int sumCashCustomer) {
        System.out.println("Succes! Take the money:");
        int number100 = sumCashCustomer / NOM_HUNDRED;
        int number50 = (sumCashCustomer - number100 * NOM_HUNDRED)/NOM_FIFTY;
        int number20 = (sumCashCustomer - number100 * NOM_HUNDRED - number50 * NOM_FIFTY) / NOM_TWENTY;
        if ((sumCashCustomer - number100 * NOM_HUNDRED - number50 * NOM_FIFTY) <= 10) {
            number20 = (sumCashCustomer - number100 * NOM_HUNDRED) / NOM_TWENTY;
            System.out.printf("%d : %d pcs.; %d : %d pcs. ", NOM_HUNDRED, number100, NOM_TWENTY, number20);
        } else {
        System.out.printf("%d : %d pcs.; %d : %d pcs.; %d : %d pcs. ", NOM_HUNDRED, number100, NOM_FIFTY, number50, NOM_TWENTY, number20);
        }
    }
}






