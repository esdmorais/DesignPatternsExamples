package br.com.designpatterns.behavioral.chainofresponsibility;

public class UseChainOfResponsibility {

    public static void main(String[] args) {
        Floor floor = new FirstFloor();
        floor.setNextFloor(new SecondFloor());
        floor.setNextFloor(new ThridFloor());
        floor.setNextFloor(new FourthFloor());
        floor.setNextFloor(new FifthFloor());

        floor.goToTheFloor(FloorID.Floor2);
        floor.goToTheFloor(FloorID.Floor5);
        floor.goToTheFloor(FloorID.Floor1);
    }

}
