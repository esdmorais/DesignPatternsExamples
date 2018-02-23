package br.com.designpatterns.creational.builder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class House {

    private double area;
    private int rooms;
    private List<String> facilites;

    public House() {
        this.facilites = new ArrayList<String>();
    }

    public abstract String getHouseType();

    public final double getArea() {
        return area;
    }

    public final void setArea(double area) {
        this.area = area;
    }

    public final int getRooms() {
        return rooms;
    }

    public final void setRooms(int rooms) {
        this.rooms = rooms;
    }

    public final List<String> getFacilities() {
        return Collections.unmodifiableList(facilites);
    }

    public final void addFacility(String facility) {
        this.facilites.add(facility);
    }

    public final void printDetails() {
        System.out.println("this house is " + this.getHouseType());
        System.out.println("area: " + this.area);
        System.out.println("rooms: " + this.rooms);
        if (!facilites.isEmpty()) {
            System.out.print("facilities: " + this.facilites.toString());
        }
    }
}