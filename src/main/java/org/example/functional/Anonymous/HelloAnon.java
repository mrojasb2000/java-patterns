package org.example.functional.Anonymous;


public class HelloAnon {
    public static void main(String[] args){
        Hello english = () -> System.out.println("Hello");
        Hello french = () -> System.out.println("Bonjour");
        Hello spanish = () -> System.out.println("Hola");

        english.sayHello();
        french.sayHello();
        spanish.sayHello();
    }
}
