package br.com.designpatterns.behavioral.observer;

public class UseObserver {

    public static void main(String[] args) {
        Item itemA = new Item("iPhone");
        itemA.subscribe(new FederalTax());
        itemA.subscribe(new ProvincialTax());
        itemA.setValue(399);

        Item itemB = new Item("MacBook");
        itemB.subscribe(new ProvincialTax());
        itemB.setValue(999);
        itemB.setValue(399);
    }

}
