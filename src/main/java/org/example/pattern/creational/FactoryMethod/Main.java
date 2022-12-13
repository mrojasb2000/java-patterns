package org.example.pattern.creational.FactoryMethod;

public class Main {
    public static void main(String[] args) {
        Payment payment = PaymentFactory.buildPayment(PaymentType.CREDIT);
        payment.doPayment();
    }
}