package br.com.designpatterns.creational.builder;

import java.util.Scanner;

public class UseBuilder {

    @SuppressWarnings("resource")
    public static void main(String[] args) throws Exception {
        System.out.println("1 - Simple ");
        System.out.println("2 - Fancy ");

        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();

        HouseBuilder builder;
        switch (option) {
            case 1:
                builder = new SimpleHouseBuilder();
                break;
            case 2:
                builder = new FancyHouseBuilder();
                break;
            default:
                throw new Exception("builder does not exist");
        }

        HouseFactory factory = new HouseFactory(builder);
        House house = factory.build();
        house.printDetails();
    }

}
