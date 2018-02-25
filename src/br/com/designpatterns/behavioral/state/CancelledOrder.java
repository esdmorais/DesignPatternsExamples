package br.com.designpatterns.behavioral.state;

public class CancelledOrder implements OrderStatus {

    @Override
    public String getMessageStatus() {
        return "your order is cancelled";
    }

    @Override
    public void change(Order order) {
        System.out.println("it is not possible to change a cancelled order");
    }

    @Override
    public void cancel(Order order) {
        System.out.println("your order is already cancelled");
    }

    @Override
    public void send(Order order) {
        System.out.println("it is not possible to send a cancelled order");
    }

}
