package com.itag.oop;

import java.util.ArrayList;

public interface IMemory {

    ArrayList<String> history = new ArrayList<>();

    default void store(String input) {
        history.add(input);
    }

    default void printHistoryAndExit() {
        System.out.println("Shutdown initialized.");
        System.out.println("Memory dump:");
        for (String s: history) {
            System.out.println(s);
        }
        System.exit(0);
    }
}
