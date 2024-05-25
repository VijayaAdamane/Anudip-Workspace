// Write a Java program to sum values of an array.
package com.anudip.lab10;
import java.util.Scanner;

public class SumOfArray {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the length of array: ");
		int length = scanner.nextInt(); // Read the length of the array

		// Initialize an array of floats with the specified length
		float[] array = new float[length];
		float sum = 0; // Initialize sum to 0

		System.out.print("Enter the array values: ");
		for (int i = 0; i < length; i++) {
			array[i] = scanner.nextFloat();
			sum += array[i]; // Add the value to the sum
		}

		// Print the sum of the array elements
		System.out.println("Sum of array elements is: " + sum);

		scanner.close();
	}
}

/*
-- Dry Run --
Input :
Length of 4
Array values: 5.0, 10.0, 15.0, 20.0


i = 0:
	array[0] = 5.0
	sum = 0.0 + 5.0 = 5.0

i = 1:
	array[1] = 10.0
	sum = 5.0 + 10.0 = 15.0
	
i = 2
	array[2] = 15.0
	sum = 15.0 + 15.0 = 30.0

i = 3
	array[3] = 20.0
	sum = 30.0 + 20.0 = 50.0

Output:
"Sum of array elements is: 50.0" 

 */