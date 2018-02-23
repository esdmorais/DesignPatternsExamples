package br.com.designpatterns.creational.builder;

public class FancyHouseBuilder implements HouseBuilder {

    private FancyHouse fancyHouse;

    @Override
    public void init() {
        this.fancyHouse = new FancyHouse();
        this.fancyHouse.setArea(683.15);
    }

    @Override
    public void buildRooms() {
        this.fancyHouse.setRooms(9);
    }

    @Override
    public void buildFacilities() {
        this.fancyHouse.addFacility("beautiful garden");
        this.fancyHouse.addFacility("large garage");
        this.fancyHouse.addFacility("olympic swimming pool");
        this.fancyHouse.addFacility("15 cameras");
    }

    @Override
    public House result() {
        return fancyHouse;
    }
}
