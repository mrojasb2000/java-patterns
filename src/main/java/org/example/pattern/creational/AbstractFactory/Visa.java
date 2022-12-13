package org.example.pattern.creational.AbstractFactory;

public class Visa implements Card {
    @Override
    public String getCardType() {
        return "Visa";
    }

    @Override
    public String getCardNumber() {
        return "0000-0000-0000 VISA";
    }
}
