package br.com.designpatterns.creational.prototype;

public class UsePrototype {

    public static void main(String[] args) {
        BusCard myFirstCard = new BusCard();
        myFirstCard.setOwnerName("Phoebe Buffay");
        myFirstCard.setBusCardCredit(150);

        BusCard mySecondCard = new BusCard(myFirstCard);
        mySecondCard.setOwnerName("Joey Tribbiani");

        BusMetroCard myThridCard = new BusMetroCard(mySecondCard);
        myThridCard.setOwnerName("Rachel Green");
        myThridCard.setMetroCardCredit(180);

        BusMetroCard myFourthCard = new BusMetroCard(myThridCard);
        myFourthCard.setOwnerName("Monica Geller");

        myFirstCard.printInfo();
        mySecondCard.printInfo();
        myThridCard.printInfo();
        myFourthCard.printInfo();
    }
}
