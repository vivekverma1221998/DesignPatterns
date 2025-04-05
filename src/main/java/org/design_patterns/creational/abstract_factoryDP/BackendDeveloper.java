package org.design_patterns.creational.abstract_factoryDP;

public class BackendDeveloper implements Employee{

    private  String name;

    private int salary;

    private String department;

    public BackendDeveloper(String name, int salary, String department) {
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    @Override
    public String getDetails() {
        return "Backend{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }
}
