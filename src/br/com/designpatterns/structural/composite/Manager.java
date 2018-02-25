package br.com.designpatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Manager implements Employee {

    private String name;
    private List<Employee> employees;

    public Manager(String name) {
        this.name = name;
        this.employees = new ArrayList<Employee>();
    }

    public String getName() {
        return name;
    }

    public void addEmployee(Employee employee) {
        this.employees.add(employee);
    }

    public void removeEmployee(Employee employee) {
        this.employees.remove(employee);
    }

    @Override
    public void work() {
        if (!employees.isEmpty()) {
            System.out.println("manager " + name + " asked to her employees to work");

            for (Employee employee : employees) {
                employee.work();
            }
        }
    }
}
