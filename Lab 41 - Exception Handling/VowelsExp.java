// Write a Java program to create a method that takes a string as input and throws an exception if the string does not contain vowels
package com.lab41;

import java.util.Scanner;

// Define the custom exception class for handling cases where no vowels are found
class NoVowelException extends Exception {
	public NoVowelException(String message) {
		super(message);
	}
}

public class VowelsExp {

	// Method to check if the input string contains any vowels
	public static void checkForVowels(String s) throws NoVowelException {
		// Regular expression to check for vowels (both uppercase and lowercase)
		if (!s.matches(".*[AEIOUaeiou].*")) {
			// Throw custom exception if no vowels are found
			throw new NoVowelException("The string does not contain any vowels.");
		}
		// Print message if vowels are found
		System.out.println("The string contains vowels.");
	}

	public static void main(String[] args) {
		// Create a Scanner object to read input from the user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string:");
		// Read a line of input from the user
		String str = sc.nextLine();

		// Try to check for vowels and handle the custom exception if thrown
		try {
			checkForVowels(str);
		} catch (NoVowelException e) {
			// Print the exception message if no vowels are found
			System.out.println(e.getMessage());
		}

		// Close the scanner to avoid resource leaks
		sc.close();
	}
}