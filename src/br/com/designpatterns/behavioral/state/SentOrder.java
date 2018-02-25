package br.com.designpatterns.behavioral.state;

public class SentOrder implements OrderStatus {

    @Override
    public String getMessageStatus() {
        return "your order has sent";
    }

    @Override
    public void change(Order order) {
        System.out.println("it is not possible to make changes, your order has already been sent");
    }

    @Override
    public void cancel(Order order) {        
        System.out.println("it is not possible to cancel, your order has already been sent");
    }

    @Override
    public void send(Order order) {
        System.out.println("your order has already been sent");
    }

}
