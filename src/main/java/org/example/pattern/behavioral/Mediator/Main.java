package org.example.pattern.behavioral.Mediator;

public class Main {
    public static void main(String[] args) {
        ConcreteMediator mediator = new ConcreteMediator();
        Airplane airplane = new Airplane(mediator);
        Copter copter = new Copter(mediator);

        mediator.setAirplane(airplane);
        mediator.setCopter(copter);

        airplane.send("S.O.S");
        copter.send("OK, understood");
    }
}