//Write a Java program to find the number of days in a month.
package com.anudip.practiceprograms;

import java.util.Scanner;

public class MonthDays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the name of a month
        System.out.print("Enter month name: ");
        String inputMonth = scanner.next();

        // Convert the input to lowercase to make the comparison case-insensitive
        String month = inputMonth.toLowerCase();

        // Determine the number of days in the entered month
        if (month.equals("january") || month.equals("march") || month.equals("may") ||
                month.equals("july") || month.equals("august") || month.equals("october") || month.equals("december")) {
            System.out.println(inputMonth + " has 31 days.");
        } else if (month.equals("april") || month.equals("june") || month.equals("september")
                || month.equals("november")) {
            System.out.println(inputMonth + " has 30 days.");
        } else if (month.equals("february")) {
            System.out.println(inputMonth + " has 28/29 days.");
        } else {
            // Handle invalid month input
            System.out.println("Invalid input. Please enter a valid month name.");
        }

        // Close the scanner object to prevent resource leaks
        scanner.close();
    }
}

// Dry Run:
// Enter month name: february
// february has 28/29 days.
