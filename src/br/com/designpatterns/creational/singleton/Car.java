package br.com.designpatterns.creational.singleton;

public class Car {

    private String name;
    private volatile static Car instance;

    private Car() {}

    public static Car getInstance() {
        if (instance == null) {
            synchronized (Car.class) {
                if (instance == null) {
                    instance = new Car();
                }
            }
        }
        return instance;
    }

    public String getName() {
        return name;
    }

    public void setName(String nome) {
        this.name = nome;
    }
}
