package br.com.designpatterns.behavioral.templatemethod;

public class FancyGun extends Gun {

    @Override
    public String getTarget() {
        return "window";
    }

    @Override
    public void load() {
    }

    @Override
    public boolean isGunLoaded() {
        System.out.println("this is a fancy gun, so it is loaded automatically.");
        return true;
    }
}
