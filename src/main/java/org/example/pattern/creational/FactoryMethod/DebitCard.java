package org.example.pattern.creational.FactoryMethod;

public class DebitCard implements Payment {
    @Override
    public void doPayment() {
        System.out.println("Debit card payment");
    }
}
