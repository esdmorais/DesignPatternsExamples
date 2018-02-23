package br.com.designpatterns.creational.prototype;

public class BusCard extends Card {

    private double busCardCredit;

    public BusCard(BusCard busCard) {
        super(busCard);
        this.busCardCredit = busCard.busCardCredit;
    }

    public BusCard() {
    }

    public double getBusCardCredit() {
        return busCardCredit;
    }

    public void setBusCardCredit(double busCardCredit) {
        this.busCardCredit = busCardCredit;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("busCard credit: " + this.busCardCredit);
    }

    @Override
    public Card cloneCard() {
        return new BusCard(this);
    }
}
