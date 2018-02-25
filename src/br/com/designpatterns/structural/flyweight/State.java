package br.com.designpatterns.structural.flyweight;

public class State {
    private String name;

    public State(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
