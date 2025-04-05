package org.design_patterns.creational.prototypeDP;

public class Main {


    public static void main(String[] args) throws InterruptedException, CloneNotSupportedException {
        Employee emp = new Employee("vivek" , 1000, "cse");

        System.out.println(emp);

        /*
        The Prototype Design Pattern is a creational pattern that is used when
        creating an object is costly or complex.
        Instead of creating a new object from scratch,
        we clone an existing object (the prototype) and modify it if needed.
         */
        Employee emp2 = (Employee) emp.clone();
        System.out.println(emp2);






    }
}
