package br.com.designpatterns.creational.abstractfactory.laptop;

public class MacBook implements Laptop {

    @Override
    public void surfOnTheInternet() {
        System.out.println("surfing on the internet from a MacBook...");
    }

}
