package br.com.designpatterns.behavioral.state;

public class Order {

    private String name;
    private OrderStatus orderStatus;

    public void buy() {
        this.orderStatus = new ProcessingOrder();
    }

    public void change() {
        orderStatus.change(this);
    }

    public void cancel() {
        orderStatus.cancel(this);
    }

    public void send() {
        orderStatus.send(this);
    }

    public void changeStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}