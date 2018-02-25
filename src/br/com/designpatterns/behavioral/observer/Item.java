package br.com.designpatterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Item implements Publisher {
    private String name;
    private double value;
    private List<Subscriber> subscribers;

    public Item(String name) {
        this.name = name;
        this.subscribers = new ArrayList<Subscriber>();
    }

    public String getName() {
        return name;
    }

    @Override
    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
        System.out.println("the " + name + " price was updated! the new value is " + value);
        notifySubscribers();
    }

    public void subscribe(Subscriber subscriber) {
        this.subscribers.add(subscriber);
    }

    public void unsubscribe(Subscriber subscriber) {
        this.subscribers.remove(subscriber);
    }

    private void notifySubscribers() {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(this);
        }
    }
}
