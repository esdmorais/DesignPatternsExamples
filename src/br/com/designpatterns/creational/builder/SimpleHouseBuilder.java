package br.com.designpatterns.creational.builder;

public class SimpleHouseBuilder implements HouseBuilder {

    private SimpleHouse simpleHouse;

    @Override
    public void init() {
        this.simpleHouse = new SimpleHouse();
        this.simpleHouse.setArea(152.5);
    }

    @Override
    public void buildRooms() {
        this.simpleHouse.setRooms(2);
    }

    @Override
    public void buildFacilities() {
        this.simpleHouse.addFacility("garden");
        this.simpleHouse.addFacility("garage");
    }

    @Override
    public House result() {
        return simpleHouse;
    }
}
