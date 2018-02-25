package br.com.designpatterns.behavioral.visitor;

public class CaloriesCalculator implements Calculator {

    @Override
    public void visit(Food visitable) {
        if (visitable instanceof JunkFood) {
            JunkFood junkFood = (JunkFood) visitable;
            junkFood.increasePoints(junkFood.getPoints() * 0.05);
        }
    }

}
