package br.com.designpatterns.structural.adapter;

public class BrazilianPlug extends Plug {

    @Override
    public int getNumberOfSockets() {
        return 3;
    }

    @Override
    public String getPlugType() {
        return "brazilian";
    }
}
