package org.example.pattern.behavioral.Mediator;

public class Airplane extends Colleague{
    public Airplane(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void send(String message) {
        mediator.send(message, this);
    }

    @Override
    public void received(String message) {
        System.out.printf("Airplane received message from colleague: %s\n", message);
    }
}
