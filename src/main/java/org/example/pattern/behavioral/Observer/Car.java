package org.example.pattern.behavioral.Observer;

public class Car implements Observer{
    @Override
    public void update(TrafficLight trafficLight) {
        if("GREEN CAR".equals(trafficLight.status)){
            System.out.println("People Continue");
        } else {
            System.out.println("Car Stop");
        }
    }
}
