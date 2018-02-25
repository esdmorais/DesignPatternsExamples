package br.com.designpatterns.structural.bridge;

public class LCDMonitor implements Monitor {

    @Override
    public void showUp(String thing) {
        System.out.print("*****");
        for (int i = 0; i < thing.length(); i++) {
            System.out.print("*");
        }
        System.out.print("*****");

        System.out.println();

        System.out.print("**** ");
        System.out.print(thing);
        System.out.print(" ****");

        System.out.println();

        System.out.print("*****");
        for (int i = 0; i < thing.length(); i++) {
            System.out.print("*");
        }
        System.out.print("*****");

        System.out.println();
        System.out.println("LCD");
        System.out.println();
    }

}
