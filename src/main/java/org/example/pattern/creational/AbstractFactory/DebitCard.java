package org.example.pattern.creational.AbstractFactory;

public class DebitCard implements Payment {
    @Override
    public void doPayment() {
        System.out.println("Debit payment");
    }
}
