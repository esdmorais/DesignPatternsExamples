package br.com.designpatterns.creational.builder;

public interface HouseBuilder {

    void init();
    void buildRooms();
    void buildFacilities();
    House result();
}
