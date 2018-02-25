package br.com.designpatterns.structural.composite;

public class UseComposite {
    public static void main(String[] args) {
        Manager phoebe = new Manager("Phoebe");
        Employee joey = new Analyst("Joey");
        Manager rachel = new Manager("Rachel");
        Employee monica = new Analyst("Monica");
        Employee chandler = new Analyst("Chandler");
        Employee ross = new Analyst("Ross");

        phoebe.addEmployee(joey);
        phoebe.addEmployee(rachel);

        rachel.addEmployee(monica);
        rachel.addEmployee(chandler);
        rachel.addEmployee(ross);

        phoebe.work();
    }
}
