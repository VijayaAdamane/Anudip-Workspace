// package com.anudip.practiceprograms;

import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number to get it's multiplication table : ");
        int number = scanner.nextInt();

        // Loop through numbers 1 to 10 to generate the multiplication table
        for (int i = 1; i <= 10; i++) {
            // Print the current multiplication step
            System.out.println(number + " x " + i + " = " + (number * i));
        }
        scanner.close();
    }
}

// Dry Run:
// Enter a number to get it's multiplication table: 5
// 5 x 1 = 5
// 5 x 2 = 10
// 5 x 3 = 15
// ...
// 5 x 10 = 50