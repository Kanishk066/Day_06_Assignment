package com.bl.day_06;
import java.util.Scanner;
public class StopwatchProgram {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    long startTime = 0;
    long stopTime = 0;
    long elapsedTime = 0;
    boolean stopped = false;
        while (!stopped) {
        System.out.print("Press Enter to start the stopwatch");
        scanner.nextLine();
        // Record the start time in milliseconds
        long currentTime = System.currentTimeMillis();
        startTime = currentTime;
        System.out.print("Press Enter to stop the stopwatch");
        scanner.nextLine();
        // Record the stop time in milliseconds
        currentTime = System.currentTimeMillis();
        stopTime = currentTime;
        // Calculate the elapsed time in milliseconds
        elapsedTime = stopTime - startTime;
        System.out.println("Elapsed time: " + elapsedTime + " milliseconds");
        System.out.print("Do you want to continue? (y/n): ");
        String input = scanner.nextLine();
        if (!input.equalsIgnoreCase("y")) {
            stopped = true;
        }
    }
}
}
