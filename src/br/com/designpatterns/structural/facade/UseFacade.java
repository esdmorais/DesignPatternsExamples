package br.com.designpatterns.structural.facade;

public class UseFacade {

    public static void main(String[] args) {
        Order order = new Order();
        order.addItem("smartphone", 99);
        order.addItem("pair or sneakers", 24);
        order.addItem("MacBook", 1293);

        OnlineStore onlineStore = new OnlineStore();
        onlineStore.requestOrder(order, "", "FedEx");

        onlineStore.requestOrder(order, "credit card", "DHL");
    }
}
