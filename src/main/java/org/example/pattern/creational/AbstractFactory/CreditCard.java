package org.example.pattern.creational.AbstractFactory;

public class CreditCard implements Payment {
    @Override
    public void doPayment() {
        System.out.println("Credit payment");
    }
}
