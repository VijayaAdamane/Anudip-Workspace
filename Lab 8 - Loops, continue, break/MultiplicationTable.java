//Write a Java program that prompts the user to enter a number and then prints the multiplication table of that number using a for loop. The table should display multiplication from 1 to 10.
package com.anudip.logicalProgramsLab8;
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Display the multiplication table for the entered number
        System.out.println("Multiplication Table for " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }

        scanner.close();
    }
}

// Dry Run:
// Enter a number: 3
// Multiplication Table for 3:
// 3 x 1 = 3
// 3 x 2 = 6
// 3 x 3 = 9
// ...
// 3 x 10 = 30