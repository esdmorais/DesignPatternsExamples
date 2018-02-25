package br.com.designpatterns.behavioral.observer;

public abstract class Tax implements Subscriber {

    private String name;
    protected double value;

    public Tax(String name) {
        this.name = name;
    }

    protected abstract double getTaxPercentage();

    public final String getName() {
        return name;
    }

    public final double getValue() {
        return value;
    }

    @Override
    public final void update(Publisher publisher) {
        this.value = publisher.getValue() * getTaxPercentage();
        System.out.println("the " + this.name + " was updated, and the new value is " + this.value);
    }
}