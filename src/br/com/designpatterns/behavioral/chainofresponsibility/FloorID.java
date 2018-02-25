package br.com.designpatterns.behavioral.chainofresponsibility;

public enum FloorID {
    Floor1("1st floor"), Floor2("2nd floor"), Floor3("3rd floor"), Floor4("4th floor"), Floor5("5th floor");

    private String name;

    FloorID(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
