// Write a Java program that displays the sum of n odd natural numbers.
package com.anudip.practiceprograms;
import java.util.Scanner;

public class SumOfOddNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Initialize the sum to 0
        int sum = 0;

        // Loop through all numbers from 1 to the entered number
        for (int i = 1; i <= number; i++) {
            // Check if the current number is odd
            if (i % 2 != 0) {
                // Add the odd number to the sum
                sum += i;
            }
        }

        // Print the total sum of odd numbers
        System.out.println("\nSum of odd numbers up to " + number + " = " + sum);

        scanner.close();
    }
}

// Dry Run:
// Enter a number: 5
// Sum of odd numbers up to 5 = 15