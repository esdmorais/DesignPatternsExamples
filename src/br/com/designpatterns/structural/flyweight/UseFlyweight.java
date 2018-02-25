package br.com.designpatterns.structural.flyweight;

public class UseFlyweight {

    public static void main(String[] args) {
        ShippingManager shippingManager = new ShippingManager();
        shippingManager.generateShipping("iPhone", "1500 Dufferin St., Toronto", "Ontario");
        System.out.println("number of states: " + StateFactory.getNumberOfStates());

        shippingManager.generateShipping("iPad", "889 Nothingham Av., Vancouver", "British Columbia");
        System.out.println("number of states: " + StateFactory.getNumberOfStates());

        shippingManager.generateShipping("MacBook", "7 Michigam Bl., Ottawa", "Ontario");
        System.out.println("number of states: " + StateFactory.getNumberOfStates());
    }
}
