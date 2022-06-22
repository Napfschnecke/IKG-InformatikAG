package com.itag.oop;

import com.itag.oop.inheritance.Car;

public class Main {

    public static void main(String[] args) {
        Introduction intro = new Introduction(State.OK);
        intro.increment();
        System.out.println("--------------------");
        Introduction intro2 = new Introduction(State.OK);
        intro2.increment();

    }
}
