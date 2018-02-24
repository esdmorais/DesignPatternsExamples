package br.com.designpatterns.structural.decorator;

public abstract class Component extends Computer {
    protected Computer wrappedComputer;

    public Component(Computer computador) {
        this.wrappedComputer = computador;
    }

    public abstract String getDescription();
}
