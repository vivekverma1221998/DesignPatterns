package org.design_patterns.creational.abstract_factoryDP;

public class main {

    public static void main(String[] args) {

        String type = "frontend";


        Employee emp = EmployeeOrchestrator.createEmployeeObject( type , new EmployeeAbstractFactoryImpl());

        System.out.println(emp.getDetails());
    }

}
