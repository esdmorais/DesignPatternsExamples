package br.com.designpatterns.creational.prototype;

public abstract class Card {
    private String ownerName;

    public Card() {
    }

    public Card(Card card) {
        this.ownerName = card.ownerName;
    }

    public final String getOwnerName() {
        return ownerName;
    }

    public final void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void printInfo() {
        System.out.println();
        System.out.println("name: " + this.ownerName);
    }

    public abstract Card cloneCard();
}
