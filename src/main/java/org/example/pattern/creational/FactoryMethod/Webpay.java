package org.example.pattern.creational.FactoryMethod;

public class Webpay implements Payment{
    @Override
    public void doPayment() {
        System.out.println("Webpay payment");
    }
}
