package org.example.pattern.creational.FactoryMethod;

public class PaymentFactory {
    public static Payment buildPayment(PaymentType paymentType){
        Payment payment = null;
        switch (paymentType) {
            case DEBIT: payment = new DebitCard();
            case CREDIT: payment = new CreditCard();
            case PAYPAL: payment = new Paypal();
            default: payment = new Webpay();
        }
        return payment;
    }
}
