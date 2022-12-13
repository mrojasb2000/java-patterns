package org.example.pattern.creational.Builder;

public class Main {
    public static void main(String[] args) {
        Card card = new Card.CardBuilder("VISA", "0000 1111 2222 3333")
                .name("Jhon Doe")
                .expires(2024)
                .credit(true)
                .build();
        System.out.printf("Card: %s", card.toString());
    }
}