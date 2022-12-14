package org.example.functional.RunnableInterface;

public class RunnableFunctionalInterface {
    public static void main(String[] args){
        Thread threadWithAnonymousImplementation = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Printing from anonymous inner class implementation");
            }
        });
        threadWithAnonymousImplementation.start();

        Thread threadWithLambdaImplementation = new Thread(() -> System.out.println("Printing from Lambda implementation"));
        threadWithLambdaImplementation.start();
    }
}
