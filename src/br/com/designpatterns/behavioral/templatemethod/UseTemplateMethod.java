package br.com.designpatterns.behavioral.templatemethod;

public class UseTemplateMethod {

    public static void main(String[] args) {
        SimpleGun simpleGun = new SimpleGun();
        simpleGun.shot();

        simpleGun.load();
        simpleGun.shot();

        FancyGun fancyGun = new FancyGun();
        fancyGun.shot();
    }

}
