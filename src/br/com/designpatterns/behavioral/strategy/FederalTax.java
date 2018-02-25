package br.com.designpatterns.behavioral.strategy;

public class FederalTax implements Tax {

    @Override
    public double calculate(Item order) {
        return order.getValue() * 0.1;
    }

    @Override
    public String getTaxName() {
        return "Federal Tax";
    }
}
