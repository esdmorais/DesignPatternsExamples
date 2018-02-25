package br.com.designpatterns.behavioral.mediator;

public class FemalePerson extends Person {

    public FemalePerson(String name) {
        super(name);
    }

    @Override
    public void receiveMessage(String from, String message) {
        System.out.print("to a woman: ");
        super.receiveMessage(from, message);
    }
}
