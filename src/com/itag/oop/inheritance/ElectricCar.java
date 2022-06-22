package com.itag.oop.inheritance;

public class ElectricCar extends Car{

    private double batteryCapacity;

    public ElectricCar(String color, int speed, int passengerCapacity, double batteryCapacity) {
        // calls constructor of super-class (Car) and assigns the additional parameter thats unique to the ElecticCar class
        super(color, speed, passengerCapacity);
        this.batteryCapacity = batteryCapacity;
    }

    /*
    I could override the move method again to implement unique behaviour for the ElectricCar's

    @Override
    void move() {
        super.move();
        System.out.println("This car is electric. Battery capacity: " + batteryCapacity + " whatever unit.");
    }
     */
}
