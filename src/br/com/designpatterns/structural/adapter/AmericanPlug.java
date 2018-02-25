package br.com.designpatterns.structural.adapter;

public class AmericanPlug extends Plug {

    @Override
    public int getNumberOfSockets() {
        return 2;
    }

    @Override
    public String getPlugType() {
        return "american";
    }
}
