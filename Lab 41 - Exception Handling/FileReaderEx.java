// Write a Java program to create a method that reads a file and throws an exception if the file is not found.
package com.lab41;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReaderEx {
	// Method to read a file and throw FileNotFoundException if not found
	public static void readFile(String filename) throws FileNotFoundException {
		File file = new File(filename);

		// Check if the file exists
		if (!file.exists()) {
			throw new FileNotFoundException("File '" + filename + "' not found.");
		}

		// If file exists, read its contents
		try (Scanner scanner = new Scanner(file)) {
			System.out.println("Reading file contents:");
			while (scanner.hasNextLine()) {
				String line = scanner.nextLine();
				System.out.println(line);
			}
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the file name to read: ");
		String filename = input.nextLine();

		try {
			// Attempt to read the file
			readFile(filename);
		} catch (FileNotFoundException e) {
			// Catch and handle the FileNotFoundException
			System.out.println(e.getMessage());
		} finally {
			input.close(); // Closing the scanner to prevent resource leak
		}
	}
}
