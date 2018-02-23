package br.com.designpatterns.creational.builder;

public class HouseFactory {

    private HouseBuilder builder;

    public HouseFactory(HouseBuilder houseBuilder) {
        this.builder = houseBuilder;
    }

    public House build() {
        builder.init();
        builder.buildRooms();
        builder.buildFacilities();

        return builder.result();
    }
}
