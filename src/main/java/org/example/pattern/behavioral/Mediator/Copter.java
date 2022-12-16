package org.example.pattern.behavioral.Mediator;

public class Copter extends Colleague{
    public Copter(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void send(String message) {
        mediator.send(message, this);
    }

    @Override
    public void received(String message) {
        System.out.printf("Copter received message from colleague: %s\n", message);
    }
}
