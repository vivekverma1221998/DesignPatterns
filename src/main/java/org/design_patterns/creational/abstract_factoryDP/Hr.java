package org.design_patterns.creational.abstract_factoryDP;

public class Hr implements Employee{

    private  String name;

    private int salary;

    private String department;

    public Hr(String name, int salary, String department) {
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    @Override
    public String getDetails() {
        return "Hr{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }


}
