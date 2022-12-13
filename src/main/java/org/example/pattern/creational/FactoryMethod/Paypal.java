package org.example.pattern.creational.FactoryMethod;

public class Paypal implements Payment {
    @Override
    public void doPayment() {
        System.out.println("Paypal payment");
    }
}
