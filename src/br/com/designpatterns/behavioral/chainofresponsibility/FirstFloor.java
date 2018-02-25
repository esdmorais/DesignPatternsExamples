package br.com.designpatterns.behavioral.chainofresponsibility;

public class FirstFloor extends Floor {

    public FirstFloor() {
        super(FloorID.Floor1);
    }

    @Override
    protected void openTheDoor() {
        System.out.println("opening the 1st floor's door");
    }
}
