package br.com.designpatterns.structural.facade;

public class ShippingMode {

    public void ship(Order order, String forwardMode) {
        System.out.println("order sent by " + forwardMode);
    }
}
