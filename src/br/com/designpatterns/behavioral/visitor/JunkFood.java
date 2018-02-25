package br.com.designpatterns.behavioral.visitor;

public class JunkFood implements Food {

    private String name;
    private double points;

    public JunkFood(String string, double i) {
        this.name = string;
        this.points = i;
    }

    public String getName() {
        return name;
    }

    public double getPoints() {
        return points;
    }

    @Override
    public void accept(Calculator visitor) {
        visitor.visit(this);
    }

    public void increasePoints(double extraPoints) {
        points += extraPoints;
    }
}
