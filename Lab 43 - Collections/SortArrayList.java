// Write a Java program to sort a given array list.

package com.lab43;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortArrayList {
	public static void main(String[] args) {
		// Creating an ArrayList
		ArrayList<Integer> numbers = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);

		// Taking input from the user
		System.out.println("Enter the number of elements you want to add:");
		int n = scanner.nextInt();

		System.out.println("Enter " + n + " integers:");
		for (int i = 0; i < n; i++) {
			int num = scanner.nextInt();
			numbers.add(num);
		}

		// Printing the original ArrayList
		System.out.println("Original ArrayList: " + numbers);

		// Sorting the ArrayList
		Collections.sort(numbers);

		// Printing the sorted ArrayList
		System.out.println("Sorted ArrayList: " + numbers);

		scanner.close();
	}
}
