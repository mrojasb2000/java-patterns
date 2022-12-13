package org.example.pattern.creational.AbstractFactory;

public class MasterCard implements Card {
    @Override
    public String getCardType() {
        return "MasterCard";
    }

    @Override
    public String getCardNumber() {
        return "000-000-00000 MASTER";
    }
}
