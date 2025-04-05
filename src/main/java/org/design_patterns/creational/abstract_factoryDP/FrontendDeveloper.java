package org.design_patterns.creational.abstract_factoryDP;


public class FrontendDeveloper implements Employee{

    private  String name;

    private int salary;

    private String department;

    public FrontendDeveloper(String name, int salary, String department) {
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    @Override
    public String getDetails() {
        return "Frontend{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }
}
