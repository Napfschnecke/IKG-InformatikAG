package com.itag.oop;

public class Main {

    public static void main(String[] args) {
        /*
        Introduction intro = new Introduction(State.OK);
        intro.increment();
        System.out.println("--------------------");
        Introduction intro2 = new Introduction(State.OK);
        intro2.increment();
         */

        Car golf = new Car("blau", 200);
        System.out.println(golf.drive());

    }
}
