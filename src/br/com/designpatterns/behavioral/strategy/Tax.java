package br.com.designpatterns.behavioral.strategy;

public interface Tax {

    public String getTaxName();
    public double calculate(Item item);
}