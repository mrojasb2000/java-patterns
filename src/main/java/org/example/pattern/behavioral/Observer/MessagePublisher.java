package org.example.pattern.behavioral.Observer;

import java.util.ArrayList;
import java.util.List;

public class MessagePublisher implements Subject{
    private List<Observer> observers = new ArrayList<Observer>();

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notify(TrafficLight trafficLight) {
        observers.forEach(item -> item.update(trafficLight));
    }
}
