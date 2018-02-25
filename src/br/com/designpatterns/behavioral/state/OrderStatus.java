package br.com.designpatterns.behavioral.state;

public interface OrderStatus {
    public String getMessageStatus();

    public void change(Order order);
    public void cancel(Order order);
    public void send(Order order);
}