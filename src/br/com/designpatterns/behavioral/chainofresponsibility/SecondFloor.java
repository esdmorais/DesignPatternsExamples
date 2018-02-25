package br.com.designpatterns.behavioral.chainofresponsibility;

public class SecondFloor extends Floor {

    public SecondFloor() {
        super(FloorID.Floor2);
    }

    @Override
    protected void openTheDoor() {
        System.out.println("opening the 2nd floor's door");
    }
}
