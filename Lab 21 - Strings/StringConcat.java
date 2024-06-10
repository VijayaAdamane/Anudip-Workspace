// Write a Java program to concatenate a given string to the end of another string.

package com.LabStrings;

import java.util.Scanner;

public class StringConcat {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first string
        System.out.print("Enter a string: ");
        String str1 = scanner.nextLine(); 

        // Prompt the user to enter the second string
        System.out.print("Enter another string to concatenate: ");
        String str2 = scanner.nextLine();
        
        // Concatenate the strings using str1.concat(str2)
        String concatenatedString = str1.concat(str2);

        // Print the concatenated string
        System.out.println("Concatenated String: " + concatenatedString);

        scanner.close();
    }
}
