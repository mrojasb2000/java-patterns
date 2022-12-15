package org.example.pattern.behavioral.Observer;

public class People implements Observer{
    @Override
    public void update(TrafficLight trafficLight) {
        if("GREEN PEOPLE".equals(trafficLight.status)){
            System.out.println("People Continue");
            System.out.println("Car Stop");
        }
    }
}
