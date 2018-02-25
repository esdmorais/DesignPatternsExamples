package br.com.designpatterns.structural.facade;

public class PaymentMethod {

    public boolean payOrder(Order order, String paymentMethod) {
        if (paymentMethod.isEmpty()) {
            return false;
        } else {
            System.out.println("order: " + order.getAmount() + " | taxes: " + order.getTaxes() + " | paid by " + paymentMethod);
            return true;
        }
    }
}
