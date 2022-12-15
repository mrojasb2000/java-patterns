package org.example.pattern.behavioral.Observer;

public class Car implements Observer{
    @Override
    public void update(TrafficLight trafficLight) {
        if("GREEN CAR".equals(trafficLight.status)){
            System.out.println("Car Continue");
            System.out.println("People Stop");
        }
    }
}
