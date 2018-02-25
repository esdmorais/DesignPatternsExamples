package br.com.designpatterns.behavioral.mediator;

public abstract class Person {
    private String name;
    private VirtualChatRoom sala;

    public Person(String nome) {
        this.name = nome;
    }

    public String getName() {
        return name;
    }

    public VirtualChatRoom getSala() {
        return sala;
    }

    public void setChatRoom(VirtualChatRoom sala) {
        this.sala = sala;
    }

    public void sendMessage(Person to, String message) {
        sala.sendMessage(name, to.getName(), message);
    }

    public void receiveMessage(String from, String message) {
        System.out.println(from + " to " + name + ": " + message);
    }
}
