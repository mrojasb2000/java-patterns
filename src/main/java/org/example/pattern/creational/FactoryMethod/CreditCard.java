package org.example.pattern.creational.FactoryMethod;

public class CreditCard implements Payment {
    @Override
    public void doPayment() {
        System.out.println("Credit card payment");
    }
}
