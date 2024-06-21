// Write a Java program to get the first and last occurrence of the specified elements in a linked list.

package com.lab43;

import java.util.LinkedList;
import java.util.Scanner;

public class FirstAndLastElemLinkedList {
	public static void main(String[] args) {

		LinkedList<Integer> numbers = new LinkedList<Integer>();

		Scanner scanner = new Scanner(System.in);

		// Prompt the user to enter the number of elements
		System.out.println("Enter the number of elements you want to enter in List : ");
		int length = scanner.nextInt();

		// Prompt the user to enter the elements
		System.out.println("Enter the elements : ");

		for (int i = 0; i < length; i++) {
			int num = scanner.nextInt();
			numbers.add(num);
		}

		System.out.println("Enter the element to find its first and last occurrence:");
		int element = scanner.nextInt();

		// Find the first occurrence of the specified element in the LinkedList
		int firstOccurrence = numbers.indexOf(element);

		// Find the last occurrence of the specified element in the LinkedList
		int lastOccurrence = numbers.lastIndexOf(element);

		// Print the results
		System.out.println("First occurrence of " + element + " is at index " + firstOccurrence);
		System.out.println("Last occurrence of " + element + " is at index " + lastOccurrence);

		scanner.close();
	}
}
