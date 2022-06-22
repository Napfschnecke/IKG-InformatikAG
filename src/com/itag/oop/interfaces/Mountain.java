package com.itag.oop.interfaces;

public class Mountain {

    int height;
    String name;

    public Mountain(String name, int height) {
        this.name = name;
        this.height = height;
    }

    /*
    @Override
    public int compareTo(Mountain m) {
        return this.height - m.height;
    }
     */

    @Override
    public String toString() {
        return "The mountain " + name + " is " + height + "m high.";
    }
}
