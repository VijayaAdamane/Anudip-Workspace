//Write a Java program that takes three numbers from the user and prints the greatest number.
package com.anudip.practiceprograms;
import java.util.Scanner;

public class GreatestNumber {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter three integers
        System.out.print("Enter first number (a): ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number (b): ");
        int num2 = scanner.nextInt();

        System.out.print("Enter third number (c): ");
        int num3 = scanner.nextInt();

        // Determine the greatest number among the three entered numbers
        if (num1 >= num2 && num1 >= num3) {
            // num1 is the greatest
            System.out.println(num1 + " is the largest number.");
        } else if (num2 >= num1 && num2 >= num3) {
            // num2 is the greatest
            System.out.println(num2 + " is the largest number.");
        } else {
            // num3 is the greatest
            System.out.println(num3 + " is the largest number.");
        }

        // Close the scanner object to prevent resource leaks
        scanner.close();
    }
}

// Dry Run:
// Enter first number (a): 10
// Enter second number (b): 20
// Enter third number (c): 5
// 20 is the largest number.