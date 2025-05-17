package org.design_patterns.behavioral.chain_of_responsiblity;

public class Upi extends PaymentProcessorAbstract{

    @Override
    public void withdrawl(int amount) {
        if(amount > 1000 && amount < 10000){
            System.out.println("Processing payment using UPI: " + amount);
        }else{
            next.withdrawl(amount);
        }
    }
}
