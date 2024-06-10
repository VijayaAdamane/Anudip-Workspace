// Write a Java program to get the character at the given index within the string. 
package com.LabStrings;

import java.util.Scanner;

public class GetCharAtIndex {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        // Prompt the user to enter an index
        System.out.print("Enter the index (between 0 and " + (str.length() - 1) + "): ");
        int index = scanner.nextInt();

        // check if index is within the string's bounds
        if (index < 0 || index >= str.length()) {
            System.out.println("Error: Index is out of bounds.");
        } else {
            // Extract the character at the specified index using charAt()
            char character = str.charAt(index);

            // Print the character
            System.out.println("Character at index " + index + " is: " + character);
        }

        scanner.close(); 
    }
}