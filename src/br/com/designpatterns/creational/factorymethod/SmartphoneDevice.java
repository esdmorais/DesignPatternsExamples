package br.com.designpatterns.creational.factorymethod;

public class SmartphoneDevice implements Device {

    @Override
    public String buy() {
        return "it is a smartphone and I paid $99.";
    }

}
