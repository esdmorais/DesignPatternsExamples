package br.com.designpatterns.behavioral.mediator;

public interface ChatRoom {

    abstract void join(Person pessoa);
    abstract void sendMessage(String from, String to, String message);

}
