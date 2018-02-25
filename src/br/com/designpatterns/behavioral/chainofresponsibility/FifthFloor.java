package br.com.designpatterns.behavioral.chainofresponsibility;

public class FifthFloor extends Floor {

    public FifthFloor() {
        super(FloorID.Floor5);
    }

    @Override
    protected void openTheDoor() {
        System.out.println("opening the 5th floor's door");
    }
}
