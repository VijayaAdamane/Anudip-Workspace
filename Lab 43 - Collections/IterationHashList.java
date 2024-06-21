// Write a Java program to iterate through all elements in a hash list

package com.lab43;

import java.util.HashSet;
import java.util.Iterator;

public class IterationHashList {
	public static void main(String[] args) {
		// Create a HashSet of Integers
		HashSet<Integer> hashSet = new HashSet<Integer>();

		// Adding elements to the HashSet
		hashSet.add(21);
		hashSet.add(23);
		hashSet.add(25);
		hashSet.add(27);
		hashSet.add(29);

		// using for each loop
		System.out.println("Iterating through the HashSet using for each loop ");
		for (Integer num : hashSet) {
			System.out.println(num);
		}

		// Using Iterator
		System.out.println("Iterating through the HashSet using Iterator ");
		Iterator<Integer> iterator = hashSet.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		
	}
}
