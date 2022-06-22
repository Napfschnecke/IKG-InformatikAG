package com.itag.oop.inheritance;

public class Car extends Vehicle {

    public Car(String color, int topSpeed, int passengerCapacity) {
        // calls constructor of super-class (Car)
        super(color, topSpeed, passengerCapacity);
    }

    // I have to override and implement this method here, since it is defined as abstract in the superclass
    @Override
    void move() {
        System.out.println("Car moving at " + topSpeed + "km/h");
    }
}
