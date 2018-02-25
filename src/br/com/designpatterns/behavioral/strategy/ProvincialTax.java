package br.com.designpatterns.behavioral.strategy;

public class ProvincialTax implements Tax {

    @Override
    public double calculate(Item order) {
        return order.getValue() * 0.04;
    }

    @Override
    public String getTaxName() {
        return "Provincial Tax";
    }
}
