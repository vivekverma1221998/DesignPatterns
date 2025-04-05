package org.design_patterns.creational.abstract_factoryDP;

public class Support implements Employee{

    private  String name;

    private int salary;

    private String department;

    public Support(String name, int salary, String department) {
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    @Override
    public String getDetails() {
        return "Support{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }
}
