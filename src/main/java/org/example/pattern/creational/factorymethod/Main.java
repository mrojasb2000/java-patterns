package org.example.pattern.creational.factorymethod;

public class Main {
    public static void main(String[] args) {
        Payment payment = PaymentFactory.buildPayment(PaymentType.CREDIT);
        payment.doPayment();
    }
}