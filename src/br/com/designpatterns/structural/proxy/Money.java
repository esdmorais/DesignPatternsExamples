package br.com.designpatterns.structural.proxy;

public class Money implements Payable {

    private double value;

    public Money(double value) {
        this.value = value;
    }

    @Override
    public void pay() {
        System.out.println("pay " + value + " by money");
    }
}
