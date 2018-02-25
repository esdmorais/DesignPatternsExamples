package br.com.designpatterns.structural.flyweight;

public class Shipping {

    private String item;
    private String address;
    private State state;

    public Shipping(String item, String address, State state) {
        this.item = item;
        this.address = address;
        this.state = state;
    }

    public String getAddress() {
        return address;
    }

    public String getItem() {
        return item;
    }

    public State getState() {
        return state;
    }
}
