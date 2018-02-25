package br.com.designpatterns.behavioral.chainofresponsibility;

public class ThridFloor extends Floor {

    public ThridFloor() {
        super(FloorID.Floor3);
    }

    @Override
    protected void openTheDoor() {
        System.out.println("opening the 3rd floor's door");
    }
}
