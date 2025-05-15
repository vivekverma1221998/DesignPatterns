package org.design_patterns.behavioral.chain_of_responsiblity_DP;

public class CreditCard extends PaymentProcessorAbstract{

    @Override
    public void withdrawl(int amount) {

        if(amount >10000){
            System.out.println("Processing payment using creditcard: " + amount);
        }
    }
}
