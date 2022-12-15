package org.example.functional.Anonymous;

public class AnnonLambda {
    public static void main(String[] args){

        new Thread(() -> {
            System.out.println("Hello from inside the anonymous lambda.");
        }).start();
    }
}
