package br.com.designpatterns.creational.prototype;

public class BusMetroCard extends BusCard {

    private double metroCardCredit;

    public BusMetroCard(BusCard busCard) {
        super(busCard);
    }

    public BusMetroCard(BusMetroCard busMetroCard) {
        super(busMetroCard);
        this.metroCardCredit = busMetroCard.metroCardCredit;
    }

    public double getMetroCardCredit() {
        return metroCardCredit;
    }

    public void setMetroCardCredit(double metroCardCredit) {
        this.metroCardCredit = metroCardCredit;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("metroCard credit: " + this.metroCardCredit);
    }

    @Override
    public Card cloneCard() {
        return new BusMetroCard(this);
    }
}
