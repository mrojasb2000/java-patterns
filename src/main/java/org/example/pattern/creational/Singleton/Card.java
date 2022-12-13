package org.example.pattern.creational.Singleton;

public class Card {
    private static Card INSTANCE;
    private String number;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    private void Card(){}

    public synchronized static Card getINSTANCE(){
        if (INSTANCE == null){
            INSTANCE = new Card();
        }
        return INSTANCE;
    }
}
