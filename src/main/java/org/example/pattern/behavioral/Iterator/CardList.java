package org.example.pattern.behavioral.Iterator;

public class CardList implements List{
    private Card[] cards;

    public CardList(Card[] cards) {
        this.cards = cards;
    }

    @Override
    public Iterator iterator() {
        return new CardIterator(cards);
    }
}
