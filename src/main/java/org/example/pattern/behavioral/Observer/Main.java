package org.example.pattern.behavioral.Observer;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        People people = new People();
        MessagePublisher messagePublisher = new MessagePublisher();
        messagePublisher.attach(car);
        messagePublisher.attach(people);
        messagePublisher.notify(new TrafficLight("GREEN PEOPLE"));
        //messagePublisher.notify(new TrafficLight("GREEN CAR"));
    }
}