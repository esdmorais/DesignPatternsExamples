package br.com.designpatterns.creational.factorymethod;

public class LaptopDevice implements Device {

    @Override
    public String buy() {
        return "it is a laptop and I paid $200.";
    }

}
