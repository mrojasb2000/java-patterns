package org.example.pattern.behavioral.Mediator;

import lombok.Setter;

@Setter
public class ConcreteMediator implements Mediator{

    private Airplane airplane;

    private Copter copter;

    @Override
    public void send(String message, Colleague colleague) {
        if (colleague==airplane){
            copter.received(message);

        } else if(colleague==copter){
            airplane.received(message);
        }
    }
}
