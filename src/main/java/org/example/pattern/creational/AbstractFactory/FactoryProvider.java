package org.example.pattern.creational.AbstractFactory;

public class FactoryProvider {
    public static AbstractFactory getFactory(FactoryEnum type) {
        switch (type) {
            case PAYMENT: return new PaymentMethodFactory();
            default: return new CardFactory();
        }
    }
}
