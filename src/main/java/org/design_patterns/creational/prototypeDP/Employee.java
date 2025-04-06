package org.design_patterns.creational.prototypeDP;

import java.util.ArrayList;
import java.util.List;

public class Employee implements Cloneable {

    private String name;
    private int sal;
    private String department;
    private List<String> list = new ArrayList<>();

    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public String getName() {
        return name;
    }

    public void setSal(int sal) throws InterruptedException {
        Thread.sleep(3000); // Simulate expensive operation
        this.sal = sal;
    }

    public int getSal() {
        return sal;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public List<String> getList() {
        return list;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", department='" + department + '\'' +
                ", list=" + list +
                '}';
    }

    // Deep clone
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Employee cloned = (Employee) super.clone();
        // Deep copy of list
        cloned.list = new ArrayList<>(this.list);
        return cloned;
    }
}
