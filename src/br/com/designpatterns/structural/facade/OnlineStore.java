package br.com.designpatterns.structural.facade;

public class OnlineStore {

    public boolean requestOrder(Order order, String paymentMethodName, String forwardMode) {
        TaxCalculator taxCalculator = new TaxCalculator();
        taxCalculator.calculateTaxes(order);

        PaymentMethod paymentMethod = new PaymentMethod();
        if (paymentMethod.payOrder(order, paymentMethodName)) {
            ShippingMode forwardOrder = new ShippingMode();
            forwardOrder.ship(order, forwardMode);
            return true;
        } else {
            System.out.println("order was not paid, please try again");
            System.out.println();
            return false;
        }
    }
}
