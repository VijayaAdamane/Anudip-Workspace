//Write a Java program that prompts the user to enter a positive integer and calculates its factorial using a while loop. The program should display the factorial as the output.

package com.anudip.logicalProgramsLab8;

import java.util.Scanner;
public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        // Calculate factorial using a while loop
        int factorial = 1;
        int originalNumber = number; // Store the original number for display purposes
        while (number > 0) {
            factorial *= number;
            number--;
        }

        // Display the factorial
        System.out.println("Factorial of " + originalNumber + " = " + factorial);

        scanner.close();
    }
}

// Dry Run:
// Enter a positive integer: 5
// Factorial of 5 = 120