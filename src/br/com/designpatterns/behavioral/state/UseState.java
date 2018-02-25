package br.com.designpatterns.behavioral.state;

public class UseState {

    public static void main(String[] args) {
        Order order = new Order();
        order.setName("iPhone");

        System.out.println("order: " + order.getName());

        order.buy();
        System.out.println("order status after buy: " + order.getOrderStatus().getMessageStatus());

        order.send();
        System.out.println("order status after send: " + order.getOrderStatus().getMessageStatus());

        order.send();
        System.out.println("order status after send again: " + order.getOrderStatus().getMessageStatus());

        System.out.println();

        order = new Order();
        order.setName("MacBook");

        System.out.println("order: " + order.getName());

        order.buy();
        System.out.println("order status after buy: " + order.getOrderStatus().getMessageStatus());

        order.change();
        System.out.println("order status after change: " + order.getOrderStatus().getMessageStatus());

        order.cancel();
        System.out.println("order status after cancel: " + order.getOrderStatus().getMessageStatus());

        order.cancel();
        System.out.println("order status after cancel again: " + order.getOrderStatus().getMessageStatus());
    }

}
