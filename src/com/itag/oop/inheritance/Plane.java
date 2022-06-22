package com.itag.oop.inheritance;

public class Plane extends Vehicle {


    public Plane(String color, int topSpeed, int passengerCapacity) {
        super(color, topSpeed, passengerCapacity);
    }

    @Override
    void move() {
        System.out.println("Plane flying at " + topSpeed + "km/h");
    }
}
