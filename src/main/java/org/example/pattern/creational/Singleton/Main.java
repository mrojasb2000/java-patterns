package org.example.pattern.creational.Singleton;

public class Main {
    public static void main(String[] args) {
        Card.getINSTANCE().setNumber("0000 1111 2222 3333");
        System.out.printf("Card number: %s", Card.getINSTANCE().getNumber());
    }
}