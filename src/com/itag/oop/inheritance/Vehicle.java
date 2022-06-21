package com.itag.oop.inheritance;

public abstract class Vehicle {

    String color;
    int topSpeed;
    int passengerCapacity;

    public Vehicle(String color, int topSpeed, int passengerCapacity) {
        this.color = color;
        this.topSpeed = topSpeed;
        this.passengerCapacity = passengerCapacity;
    }

    abstract void move();
}
