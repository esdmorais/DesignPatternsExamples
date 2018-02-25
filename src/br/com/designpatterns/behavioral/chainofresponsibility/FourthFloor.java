package br.com.designpatterns.behavioral.chainofresponsibility;

public class FourthFloor extends Floor {

    public FourthFloor() {
        super(FloorID.Floor4);
    }

    @Override
    protected void openTheDoor() {
        System.out.println("opening the 4th floor's door");
    }
}
