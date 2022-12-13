package org.example.pattern.creational.AbstractFactory;


public class Main {
    public static void main(String[] args) {
        AbstractFactory abstractFactoryCard = FactoryProvider.getFactory(FactoryEnum.CARD);
        Card card = (Card) abstractFactoryCard.create("VISA");
        System.out.printf("Card type: %s, card number: %s", card.getCardType(), card.getCardNumber());
        System.out.println("");
        card = (Card) abstractFactoryCard.create("MASTERCARD");
        System.out.printf("Card type: %s, card number: %s", card.getCardType(), card.getCardNumber());
        System.out.println("");
        System.out.println("");
        AbstractFactory abstractFactoryPayment = FactoryProvider.getFactory(FactoryEnum.PAYMENT);
        Payment payment = (Payment) abstractFactoryPayment.create("DEBIT");
        payment.doPayment();
        payment = (Payment) abstractFactoryPayment.create("CREDIT");
        payment.doPayment();
    }
}