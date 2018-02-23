package br.com.designpatterns.creational.abstractfactory;

import java.util.Scanner;

import br.com.designpatterns.creational.abstractfactory.factory.AppleFactory;
import br.com.designpatterns.creational.abstractfactory.factory.AsusFactory;
import br.com.designpatterns.creational.abstractfactory.factory.DeviceFactory;
import br.com.designpatterns.creational.abstractfactory.laptop.Laptop;
import br.com.designpatterns.creational.abstractfactory.smartphone.Smartphone;
import br.com.designpatterns.creational.abstractfactory.tablet.Tablet;

public class UseAbstractFactory {

    @SuppressWarnings("resource")
    public static void main(String[] args) throws Exception {
        System.out.println("1 - Apple");
        System.out.println("2 - Asus ");

        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();

        DeviceFactory factory;
        switch (option) {
            case 1:
                factory = new AppleFactory();
                break;
            case 2:
                factory = new AsusFactory();
                break;
            default:
                throw new Exception("factory does not exist");
        }

        Smartphone smartphone = factory.createSmartphone();
        smartphone.call();

        Tablet tablet = factory.createTablet();
        tablet.playTheGame();

        Laptop laptop = factory.createLaptop();
        laptop.surfOnTheInternet();
    }

}
