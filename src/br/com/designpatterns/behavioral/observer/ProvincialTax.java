package br.com.designpatterns.behavioral.observer;

public class ProvincialTax extends Tax {

    public ProvincialTax() {
        super("Provincial Tax");
    }

    @Override
    protected double getTaxPercentage() {
        return 0.04;
    }
}
