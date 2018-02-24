package br.com.designpatterns.structural.decorator;

public class UseDecorator {

    public static void main(String[] args) {
        Computer computer = new Computer();
        computer = new CD(computer);
        computer = new HD(computer);
        computer = new USB(computer);

        System.out.println(computer.getDescription());
    }
}
