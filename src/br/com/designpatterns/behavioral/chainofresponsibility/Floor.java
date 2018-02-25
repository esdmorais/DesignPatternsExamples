package br.com.designpatterns.behavioral.chainofresponsibility;

public abstract class Floor {
    private Floor nextFloor;
    private FloorID floorID;

    public Floor(FloorID floorID) {
        this.nextFloor = null;
        this.floorID = floorID;
    }

    public void setNextFloor(Floor nextFloor) {
        if (this.nextFloor == null) {
            this.nextFloor = nextFloor;
        } else {
            this.nextFloor.setNextFloor(nextFloor);
        }
    }

    public void goToTheFloor(FloorID id) {
        System.out.println("going to the " + id.getName() + ", it may take a while...");
        openTheDoor(id);
        System.out.println();
    }

    private void openTheDoor(FloorID id) {
        if (canOpenTheDoor(id)) {
            openTheDoor();
        } else {
            if (nextFloor == null) {
                System.out.println("floor does not exist");
            } else {
                System.out.println("going upstairs, to the " + this.nextFloor.floorID.getName());
                this.nextFloor.openTheDoor(id);
            }
            
        }
    }

    private boolean canOpenTheDoor(FloorID id) {
        return (floorID == id);
    }

    protected abstract void openTheDoor();
}