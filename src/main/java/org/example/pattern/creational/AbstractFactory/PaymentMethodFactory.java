package org.example.pattern.creational.AbstractFactory;

public class PaymentMethodFactory implements AbstractFactory<Payment> {
    @Override
    public Payment create(String type) {
        //System.out.println(type);
        if ("CREDIT".equals(type)){
            return new CreditCard();
        } else if ("DEBIT".equals(type)){
            return new DebitCard();
        }
        return null;
    }
}
