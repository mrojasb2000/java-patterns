package org.example.functional.LambdaThread;

public class Main {
    public static void main(String[] args){
        new Thread(() -> {
           System.out.println("Hello from lambda thread");
        }).start();
    }
}
