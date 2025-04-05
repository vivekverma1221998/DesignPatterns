package org.design_patterns.creational.abstract_factoryDP;

public class NonTechnicalEmployeeAbstractFactoryImpl implements EmployeeAbstractFactory{

    public NonTechnicalEmployeeAbstractFactoryImpl() {
    }

    @Override
    public Employee createEmpObject(String type) {

        if(type.toLowerCase().equalsIgnoreCase("hr")){
            return new Support("Vikash" , 2500 , "support_engineer");
        } else if (type.toLowerCase().equalsIgnoreCase("support")) {
            return new Hr("Singh" , 6500 , "hr_team");
        }else {
            return null;
        }
    }
}
