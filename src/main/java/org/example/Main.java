package org.example;

/**
 * The Main class serves as the entry point for the application.
 * It demonstrates basic output to the console and a simple loop.
 */
public class Main {
    /**
     * The main method is the entry point of the Java application.
     *
     * @param args command-line arguments passed to the application (not used in this example).
     */
    public static void main(String[] args) {
        // Print a welcome message to the console.
        System.out.printf("Hello and welcome!");

        // Loop through numbers 1 to 5 and print each number.
        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }
    }
}
