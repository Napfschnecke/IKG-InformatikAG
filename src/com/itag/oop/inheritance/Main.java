package com.itag.oop.inheritance;

public class Main {

    public static void main(String[] args) {
        // instantiates object of type Car
        Car golf = new Car("blau", 200, 4);
        golf.move();

        // instantiates object of type ElectricCar, which is a subclass of Car
        ElectricCar egolf = new ElectricCar("rot", 160, 5, 500.4);
        egolf.move();

        // instantiates object of type plane, which is a subclass of Vehicle
        Vehicle myVehicle = new Plane("weiß", 800, 300);
        myVehicle.move();
        // since my variable is of type Vehicle (and not the concrete type Plane), I can reassign a different object
        // that is also a subtype of Vehicle
        myVehicle = golf;
        myVehicle.move();
    }
}
