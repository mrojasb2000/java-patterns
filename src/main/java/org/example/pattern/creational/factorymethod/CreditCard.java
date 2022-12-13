package org.example.pattern.creational.factorymethod;

public class CreditCard implements Payment {
    @Override
    public void doPayment() {
        System.out.println("Credit card payment");
    }
}
