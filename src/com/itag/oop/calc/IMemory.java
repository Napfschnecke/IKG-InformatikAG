package com.itag.oop.calc;

import java.util.ArrayList;

public interface IMemory {

    ArrayList<String> history = new ArrayList<>();

    default void store(String input) {
        history.add(input);
    }

    default void printHistoryAndExit() {
        System.out.println("Shutdown initialized.");
        System.out.println("Memory dump:");
        history.forEach(System.out::println);
        System.exit(0);
    }
}
