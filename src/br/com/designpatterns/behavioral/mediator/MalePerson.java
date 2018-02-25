package br.com.designpatterns.behavioral.mediator;

public class MalePerson extends Person {

    public MalePerson(String name) {
        super(name);
    }

    @Override
    public void receiveMessage(String from, String message) {
        System.out.print("to a man: ");
        super.receiveMessage(from, message);
    }
}
