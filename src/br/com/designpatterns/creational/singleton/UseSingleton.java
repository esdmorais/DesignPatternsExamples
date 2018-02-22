package br.com.designpatterns.creational.singleton;

public class UseSingleton {
    public static void main(String[] args) {
        Car fox = Car.getInstance();
        fox.setName("Fox");

        Car celta = Car.getInstance();
        celta.setName("Celta");

        System.out.println("1st car is: " + fox.getName());
        System.out.println("2nd car is: " + celta.getName());
    }
}
