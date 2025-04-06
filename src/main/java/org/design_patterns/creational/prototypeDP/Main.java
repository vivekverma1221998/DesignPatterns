package org.design_patterns.creational.prototypeDP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {


    public static void main(String[] args) throws InterruptedException, CloneNotSupportedException {
        System.out.println("creating object for employee");
        Employee emp = new Employee("vivek" , "cse");
        emp.setSal(1000);
        List<String> ls = new ArrayList<>();
        ls.add("java");
        ls.add("c++");
        ls.add("python");
        emp.setList(ls);
        System.out.println("object created for employee");

        System.out.println(emp);
        /*
        The Prototype Design Pattern is a creational pattern that is used when
        creating an object is costly or complex.
        Instead of creating a new object from scratch,
        we clone an existing object (the prototype) and modify it if needed.
         */
        Employee emp2 = (Employee) emp.clone();
        System.out.println(emp2);


        List<String > al = emp.getList();

        System.out.println("After modification");
        al.remove(1);
        emp.setList(al);

        System.out.println(emp);
        System.out.println(emp2);






    }
}
