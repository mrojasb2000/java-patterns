package org.example.pattern.creational.Prototype;

import java.lang.CloneNotSupportedException;
import static org.example.pattern.creational.Prototype.PrototypeFactory.CardType.AMEX;

public class Main {
    public static void main(String[] args) {
        PrototypeFactory.loadCard();
        try {
            PrototypeCard card = PrototypeFactory.getInstance(AMEX);
            card.getCard();
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
    }
}