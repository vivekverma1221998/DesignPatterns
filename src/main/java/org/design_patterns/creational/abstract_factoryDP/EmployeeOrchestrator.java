package org.design_patterns.creational.abstract_factoryDP;

public class EmployeeOrchestrator {


    public static Employee createEmployeeObject(String type , EmployeeAbstractFactory employeeAbstractFactory){

        return employeeAbstractFactory.createEmpObject(type);
    }
}
