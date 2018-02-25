package br.com.designpatterns.behavioral.strategy;

public class TaxCalculator {

    public void caculate(Item item, Tax tax) {
        double value = tax.calculate(item);
        System.out.println("the " + tax.getTaxName() + " of the item " + item.getName() + " is " + value);
    }
}
