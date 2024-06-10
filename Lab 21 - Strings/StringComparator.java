// Write a Java program to compare a given string to the specified character sequence.

package com.LabStrings;

import java.util.Scanner;

public class StringComparator {

	public static boolean compareToString(String str, String sequence) {
		if (str == null || sequence == null || str.length() != sequence.length()) {
			return false; // Different lengths or null strings are not equal
		}
		return str.equals(sequence); // Use String.equals() for efficient comparison
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Prompt user to enter a string
		System.out.println("Enter a string:");
		String str = scanner.nextLine();

		// Prompt user to enter a character sequence
		System.out.println("Enter a character sequence to compare:");
		String sequence = scanner.nextLine();

		// Compare the string and sequence
		if (compareToString(str, sequence)) {
			System.out.println("Strings are equal.");
		} else {
			System.out.println("Strings are not equal.");
		}

		scanner.close(); // Close the Scanner to avoid resource leaks
	}
}
