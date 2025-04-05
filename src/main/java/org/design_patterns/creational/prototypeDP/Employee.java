package org.design_patterns.creational.prototypeDP;

public class Employee implements Cloneable{

    private String name;

    private int sal;

    private String department;


    public Employee(String name,int sal , String department) throws InterruptedException {
        Thread.sleep(5000);
        this.name = name;
        this.sal = sal;
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", department='" + department + '\'' +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return this;
    }
}
