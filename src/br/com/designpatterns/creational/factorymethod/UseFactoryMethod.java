package br.com.designpatterns.creational.factorymethod;

import java.util.Scanner;

public class UseFactoryMethod {

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        System.out.println("1 - Tablet ");
        System.out.println("2 - Laptop ");
        System.out.println("3 - Smartphone ");

        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();

        String connectionType = "";
        switch (option) {
            case 1:
                connectionType = DeviceFactory.TABLET;
                break;
            case 2:
                connectionType = DeviceFactory.LAPTOP;
                break;
            case 3:
                connectionType = DeviceFactory.SMARTPHONE;
                break;
            default:
                connectionType = "other";
                break;
        }

        DeviceFactory factory = new DeviceFactory();
        Device connection = factory.createDevice(connectionType);

        System.out.println("I have just bought a new eletronic device! " + connection.buy());
    }
}
