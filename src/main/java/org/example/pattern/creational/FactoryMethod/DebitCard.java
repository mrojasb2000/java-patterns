package org.example.pattern.creational.factorymethod;

public class DebitCard implements Payment {
    @Override
    public void doPayment() {
        System.out.println("Debit card payment");
    }
}
