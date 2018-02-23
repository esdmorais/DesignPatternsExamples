package br.com.designpatterns.creational.abstractfactory.smartphone;

public class IPhone implements Smartphone {

    @Override
    public void call() {
        System.out.println("calling from an iPhone...");
    }

}
