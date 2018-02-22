package br.com.designpatterns.creational.factorymethod;

public class TabletDevice implements Device {

    @Override
    public String buy() {
        return "it is a tablet and I paid $75.";
    }

}
