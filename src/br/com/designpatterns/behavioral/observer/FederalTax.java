package br.com.designpatterns.behavioral.observer;

public class FederalTax extends Tax {

    public FederalTax() {
        super("Federal Tax");
    }

    @Override
    protected double getTaxPercentage() {
        return 0.1;
    }
}
