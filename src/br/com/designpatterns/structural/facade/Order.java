package br.com.designpatterns.structural.facade;

import java.util.HashMap;
import java.util.Map;

public class Order {

    private Map<String, Double> items;
    private double taxes;
    private double amount;

    public Order() {
        this.amount = 0;
        this.items = new HashMap<String, Double>();
    }

    public void addItem(String item, double price) {
        this.items.put(item, price);
        this.amount += price;
    }

    public double getAmount() {
        return amount;
    }

    public void setTaxes(double taxes) {
        this.taxes = taxes;
        this.amount += taxes;
    }

    public double getTaxes() {
        return taxes;
    }

    public int getNumberOfItems() {
        return this.items.size();
    }
}
