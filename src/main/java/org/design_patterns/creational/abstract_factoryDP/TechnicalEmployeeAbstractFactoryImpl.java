package org.design_patterns.creational.abstract_factoryDP;

public class TechnicalEmployeeAbstractFactoryImpl implements EmployeeAbstractFactory{

    public TechnicalEmployeeAbstractFactoryImpl() {
    }

    @Override
    public Employee createEmpObject(String type) {

        if(type.toLowerCase().equalsIgnoreCase("backend")){
            return new BackendDeveloper("vivek" , 10000 , "backend_developer");
        } else if (type.toLowerCase().equalsIgnoreCase("frontend")) {
            return new FrontendDeveloper("verma" , 20000 , "frontend_developer");
        }else {
            return null;
        }
    }
}
