package com.itag.oop.calc;

import java.util.Scanner;

public class Calculator implements IMemory {

    public Calculator() {}

    public void start() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Waiting for input...");

        String question;

        while (true) {
            question = sc.nextLine();

            try {
                if (question.matches("(\\d+ [+\\-*] \\d+)")) {
                    parseCalculation(question);
                } else if (question.equals("end")) {
                    printHistoryAndExit();
                    return;
                } else {
                    System.out.println("Wrong format.");
                }
            } catch( Exception e) {
                System.out.println("Encountered an error: " + e);
            }
        }
    }

    private void parseCalculation(String question) {
        String[] parts = question.split(" ");
        int input1 = Integer.parseInt(parts[0]);
        String operator = parts[1];
        int input2 = Integer.parseInt(parts[2]);

        switch (operator) {
            case "+" -> store(question + " = " + add(input1, input2));
            case "-" -> store(question + " = " + subtract(input1, input2));
            case "*" -> store(question + " = " + multiply(input1, input2));
        }
    }

    private int add(int a, int b) {
        System.out.println(a + b);
        return a + b ;
    }

    private int subtract(int a, int b) {
        System.out.println(a - b);
        return a - b;
    }

    private int multiply(int a, int b) {
        System.out.println(a * b);
        return a * b;
    }
}
