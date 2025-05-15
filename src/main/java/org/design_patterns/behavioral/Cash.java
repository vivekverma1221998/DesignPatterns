package org.design_patterns.behavioral.chain_of_responsiblity_DP;

public class Cash extends PaymentProcessorAbstract{


    @Override
    public void withdrawl(int amount) {
        if(amount <= 1000){
            System.out.println("Processing payment using cash: " + amount);
        }else{
            next.withdrawl(amount);
        }
    }
}
