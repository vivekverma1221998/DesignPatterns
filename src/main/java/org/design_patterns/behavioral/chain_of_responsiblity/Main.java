package org.design_patterns.behavioral.chain_of_responsiblity;

public class Main {
    public static void main(String[] args) {

        PaymentProcessorAbstract paymentProcessor = new Cash();
        PaymentProcessorAbstract paymentProcessor1 = new Upi();
        PaymentProcessorAbstract paymentProcessor2 = new CreditCard();

        paymentProcessor.setNext(paymentProcessor1);
        paymentProcessor1.setNext(paymentProcessor2);

        paymentProcessor.withdrawl(1299);
        paymentProcessor.withdrawl(200);
        paymentProcessor.withdrawl(14599);
        paymentProcessor.withdrawl(8999);
        paymentProcessor.withdrawl(149);


    }
}
