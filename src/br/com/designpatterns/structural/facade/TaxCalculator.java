package br.com.designpatterns.structural.facade;

public class TaxCalculator {

    public void calculateTaxes(Order order) {
        double percent;
        int items = order.getNumberOfItems();
        if (items >= 3) {
            percent = 0.13;
        } else {
            percent = 0.3;
        }

        double taxes = order.getAmount() * percent;
        order.setTaxes(taxes);
    }
}
