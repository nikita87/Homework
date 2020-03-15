package by.teachmeskills.rakhubovskiy.doplessons.lesson8.interfacehomework.doptask2;

import by.teachmeskills.rakhubovskiy.doplessons.lesson8.interfacehomework.doptask2.jacket.IJacket;
import by.teachmeskills.rakhubovskiy.doplessons.lesson8.interfacehomework.doptask2.pants.IPants;
import by.teachmeskills.rakhubovskiy.doplessons.lesson8.interfacehomework.doptask2.shoes.IShoes;

public class Man {

    private String name;
    private IJacket jacket;
    private IPants pants;
    private IShoes shoes;

    public Man(String name, IPants pants, IJacket jacket, IShoes shoes) {
        this.name = name;
        this.jacket = jacket;
        this.pants = pants;
        this.shoes = shoes;
    }

    public Man(){
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public IJacket getJacket() {
        return jacket;
    }

    public void setJacket(IJacket jacket) {
        this.jacket = jacket;
    }

    public IPants getPants() {
        return pants;
    }

    public void setPants(IPants pants) {
        this.pants = pants;
    }

    public IShoes getShoes() {
        return shoes;
    }

    public void setShoes(IShoes shoes) {
        this.shoes = shoes;
    }

    public void putOn(){
        jacket.putOn();
        pants.putOn();
        shoes.putOn();
    }

    public void takeOff(){
        jacket.takeOff();
        pants.takeOff();
        shoes.takeOff();
    }
}
