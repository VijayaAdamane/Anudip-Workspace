// Write a Java program to get a number from user and print whether it is positive or negative                                             
package com.anudip.practiceprograms;
import java.util.Scanner;

public class PositiveNegativeChecker {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number to know if it's positive or negative number : ");
        int number = scanner.nextInt();

        // Determine if the number is positive, negative, or zero
        if (number > 0) {
            // The number is positive
            System.out.println("It's a positive number.");
        } else if (number < 0) {
            // The number is negative
            System.out.println("It's a negative number.");
        } else {
            // The number is zero
            System.out.println("It's zero.");
        }

        // Close the scanner object to prevent resource leaks
        scanner.close();
    }
}

// Dry Run:
// Enter a number to know if it's positive or negative number: -10
// It's a negative number.