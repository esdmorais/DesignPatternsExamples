package br.com.designpatterns.creational.abstractfactory.tablet;

public class IPad implements Tablet {

    @Override
    public void playTheGame() {
        System.out.println("playing a game from an iPad...");
    }

}
