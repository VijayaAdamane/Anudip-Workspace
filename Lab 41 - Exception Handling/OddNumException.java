// Write a Java program to create a method that takes an integer as a parameter and throws an exception if the number is odd
package com.lab41;

import java.util.Scanner;

//Custom exception class for handling odd numbers
class OddException extends Exception {
	public OddException(String message) {
		super(message);
	}
}

public class OddNumException {

	// Method to check if the number is odd and throw exception if true
	public static void checkOdd(int num) throws OddException {
		if (num % 2 != 0) {
			throw new OddException("The entered number is odd.");
		} else {
			System.out.println("Entered number is even.");
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		try {
			System.out.print("Enter a number: ");
			int num = scanner.nextInt();

			// Check if the number is odd
			checkOdd(num);

		} catch (OddException e) {
			// Catching and handling the custom exception for odd numbers
			System.out.println("Exception caught: " + e.getMessage());
		} catch (Exception e) {
			// Catching any other unexpected exceptions
			System.out.println("Invalid input. Please enter a valid integer.");
		} finally {
			scanner.close(); // Closing the scanner to prevent resource leak
		}
	}
}
