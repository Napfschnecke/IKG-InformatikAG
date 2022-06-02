package com.itag.oop;

public class Car {

    private String color;
    private int maxSpeed;

    public Car(String color, int speed) {
        this.color = color;
        this.maxSpeed = speed;
    }

    public int drive() {
        return maxSpeed;
    }

}
