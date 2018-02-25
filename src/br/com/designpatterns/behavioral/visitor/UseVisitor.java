package br.com.designpatterns.behavioral.visitor;

public class UseVisitor {

    public static void main(String[] args) {
        JunkFood junkFood = new JunkFood("lays potato", 500);
        System.out.println(junkFood.getName() + " has " + junkFood.getPoints() + " points.");

        junkFood.accept(new CaloriesCalculator());
        System.out.println("recalculating points: " + junkFood.getPoints());

        junkFood.accept(new FatCalculator());
        System.out.println("recalculating points: " + junkFood.getPoints());
    }
}
