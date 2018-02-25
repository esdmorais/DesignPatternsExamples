package br.com.designpatterns.structural.composite;

public class Analyst implements Employee {

    private String name;

    public Analyst(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void work() {
        System.out.println("analyst " + name + " is working...");
    }
}
