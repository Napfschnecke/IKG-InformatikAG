package com.itag.oop;

enum State {
    OK, ERROR
}
public class Introduction {


    public static int sharedAttribute;

    private int attribute;

    private State state;


    public Introduction(State state) {
        this.state = state;
    }

    public void increment() {
        this.attribute++;
        sharedAttribute++;
        System.out.println("Normales Attribut: " + attribute);
        System.out.println("Statisches Attribut: " + sharedAttribute);

        if (this.attribute != sharedAttribute) {
            this.state = State.ERROR;
        }
        switch (this.state) {
            case OK -> System.out.println("Dem Objekt gehts gut.");
            case ERROR -> System.out.println("Wallah Krise.");
        }
    }
}
