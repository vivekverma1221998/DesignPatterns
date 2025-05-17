package org.design_patterns.behavioral.chain_of_responsiblity;

public  abstract class PaymentProcessorAbstract implements PaymentProcessor{

    protected PaymentProcessor next;

    public PaymentProcessor getNext() {
        return next;
    }

    public void setNext(PaymentProcessor next) {
        this.next = next;
    }

    public abstract void withdrawl(int amount);
}
