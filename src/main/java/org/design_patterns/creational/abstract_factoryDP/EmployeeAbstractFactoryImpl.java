package org.design_patterns.creational.abstract_factoryDP;

public class EmployeeAbstractFactoryImpl implements EmployeeAbstractFactory{

    public EmployeeAbstractFactoryImpl() {
    }


    @Override
    public Employee createEmpObject(String type) {
        if(type.equalsIgnoreCase("hr") ||type.equalsIgnoreCase("support") ){
            NonTechnicalEmployeeAbstractFactoryImpl nonTechnicalEmployeeAbstractFactory = new NonTechnicalEmployeeAbstractFactoryImpl();
            return nonTechnicalEmployeeAbstractFactory.createEmpObject(type);

        }else if (type.equalsIgnoreCase("backend") || type.equalsIgnoreCase("frontend")) {
            TechnicalEmployeeAbstractFactoryImpl technicalEmployeeAbstractFactory = new TechnicalEmployeeAbstractFactoryImpl();
            return technicalEmployeeAbstractFactory.createEmpObject(type);
        }else{
            TechnicalEmployeeAbstractFactoryImpl technicalEmployeeAbstractFactory = new TechnicalEmployeeAbstractFactoryImpl();
            return technicalEmployeeAbstractFactory.createEmpObject(type);
        }
    }
}
