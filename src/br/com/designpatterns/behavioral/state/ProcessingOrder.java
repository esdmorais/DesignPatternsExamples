package br.com.designpatterns.behavioral.state;

public class ProcessingOrder implements OrderStatus {

    @Override
    public String getMessageStatus() {
        return "your order is being processed";
    }

    @Override
    public void change(Order order) {
        order.setName(order.getName() + " changed");

    }

    @Override
    public void cancel(Order order) {
        order.changeStatus(new CancelledOrder());

    }

    @Override
    public void send(Order order) {
        order.changeStatus(new SentOrder());
    }

}
