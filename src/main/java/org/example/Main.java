package org.example;

import org.example.pattern.creational.Prototype.PrototypeCard;
import org.example.pattern.creational.Prototype.PrototypeFactory;
import org.example.pattern.creational.Prototype.VisaCard;

import java.lang.CloneNotSupportedException;

import static org.example.pattern.creational.Prototype.PrototypeFactory.CardType.AMEX;
import static org.example.pattern.creational.Prototype.PrototypeFactory.CardType.VISA;

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