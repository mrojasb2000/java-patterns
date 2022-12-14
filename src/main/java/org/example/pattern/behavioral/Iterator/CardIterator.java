package org.example.pattern.behavioral.Iterator;

public class CardIterator implements Iterator{
    private Card[] cards;
    private int pos;

    public CardIterator(Card[] cards) {
        this.cards = cards;
        pos = 0;
    }

    @Override
    public Object next() {
        return cards[pos++];
    }

    @Override
    public boolean hasNext() {
        if (pos >= cards.length){
            return false;
        }
        return true;
    }

    @Override
    public Object currentItem() {
        return cards[pos];
    }
}
