package org.example.pattern.behavioral.Iterator;

public class Main {
    public static void main(String[] args) {
        Card[] cards = new Card[3];
        cards[0] = new Card("VISA");
        cards[1] = new Card("AMEX");
        cards[2] = new Card("MASTER");

        List cardList = new CardList(cards);
        Iterator iterator = cardList.iterator();

        while(iterator.hasNext()){
            System.out.println(((Card)iterator.currentItem()).getType());
            iterator.next();
        }

    }
}