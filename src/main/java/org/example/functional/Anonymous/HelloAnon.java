package org.example.functional.Anonymous;


public class HelloAnon {
    public static void main(String[] args){
        Hello english = new Hello() {
            @Override
            public void sayHello() {
                System.out.println("Hello");
            }
        };
        Hello french = new Hello() {
            @Override
            public void sayHello() {
                System.out.println("Bonjour");
            }
        };
        Hello spanish = new Hello() {
            @Override
            public void sayHello() {
                System.out.println("Hola");
            }
        };

        english.sayHello();
        french.sayHello();
        spanish.sayHello();
    }
}
