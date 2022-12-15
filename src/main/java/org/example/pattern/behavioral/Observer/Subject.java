package org.example.pattern.behavioral.Observer;

public interface Subject {
    void attach(Observer observer);
    void deattach(Observer observer);
    void notify(TrafficLight trafficLight);
}
