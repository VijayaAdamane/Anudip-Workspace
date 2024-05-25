// Write a Java program to copy an array by iterating the array.

package com.anudip.lab10;

public class CopyingArray {
	public static void main(String[] args) {
		// Original array
		int[] originalArray = { 1, 2, 3, 4, 5 };

		// Create a new array of the same length as the original array
		int[] copiedArray = new int[originalArray.length];

		// Copy elements from the original array to the new array
		for (int i = 0; i < originalArray.length; i++) {
			copiedArray[i] = originalArray[i];
		}

		// Print both arrays to show they are the same
		System.out.println("Original array:");
		for (int i : originalArray) {
			System.out.print(i + " ");
		}

		System.out.println("\nCopied array:");
		for (int i : copiedArray) {
			System.out.print(i + " ");
		}
	}
}

/*
 -- Dry Run --
 
Initial State:
originalArray = {1, 2, 3, 4, 5}
copiedArray = {0, 0, 0, 0, 0} 

i = 0
	copiedArray[0] = originalArray[0]
	copiedArray = {1, 0, 0, 0, 0}

i = 1
	copiedArray[1] = originalArray[1]
	copiedArray  = {1, 2, 0, 0, 0}

i=4 
	copiedArray[4] = originalArray[4]
	copiedArray = {1, 2, 3, 4, 5}
	
 */
