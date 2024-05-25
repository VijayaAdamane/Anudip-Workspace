// Write a Java program to display n terms of natural numbers and their sum.
package com.anudip.practiceprograms;
import java.util.Scanner;

public class SumNaturalNumbers {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Initialize the sum to 0
        int sum = 0;

        // Loop through all natural numbers from 1 to the entered number
        for (int i = 1; i <= number; i++) {
            // Print the current number
            System.out.print(i + "  ");
            sum += i;
        }

        // Print the total sum of natural numbers
        System.out.println("\nSum = " + sum);

        // Close the scanner object to prevent resource leaks
        scanner.close();
    }
}

// Dry Run:
// Enter a number: 5
// 1 2 3 4 5
// Sum = 15