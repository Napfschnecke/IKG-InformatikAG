package com.itag.oop.interfaces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Mountain> mountains = new ArrayList<>() {{
            add(new Mountain("Everest", 8848));
            add(new Mountain("Annapurna", 8091));
            add(new Mountain("Kangchendzönga", 8586));
            add(new Mountain("Nanga Parbat", 8126));
            add(new Mountain("K2", 8611));
        }};

        // Collections.sort(mountains);
        mountains.forEach(System.out::println);
    }
}
