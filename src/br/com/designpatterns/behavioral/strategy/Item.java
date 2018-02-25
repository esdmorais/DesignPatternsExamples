package br.com.designpatterns.behavioral.strategy;

public class Item {

    private double value;
    private String name;

    public Item(String name, double value) {
        this.value = value;
        this.name = name;
    }

    public double getValue() {
        return value;
    }

    public String getName() {
        return name;
    }
}
