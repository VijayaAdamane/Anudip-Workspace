//  Write a Java program to count the number of key-value (size) mappings in a map.
package com.lab43;

import java.util.HashMap;
import java.util.Map;

public class KeyValueNums {

	public void arr()

	{

	try

	{

	int y[] = { 2 , 7, 8 , 6};

	for (int j=0; j< y.length; )

	{

	j++;

	y[j] = y[j-1];

	System.out.print(y[j] + " ");

	}}catch(IndexOutOfBoundsException ie)

	{

	ie.printStackTrace();

	}

	catch(Exception e) {

	e.printStackTrace();

	}

	}

	public static void main(String args[])

	{

		KeyValueNums r = new KeyValueNums();

	}

}

//
//public class KeyValueNums {
//	public static void main(String[] args) {
//
//		// Create a HashMap to store key-value pairs
//		HashMap<Integer, String> map = new HashMap<>();
//
//		// Add key-value pairs to the map
//		map.put(1, "Apple");
//		map.put(2, "Banana");
//		map.put(3, "Orange");
//		map.put(4, "Strawberry");
//
//		// Get the number of key-value mappings (size)
//		int size = map.size();
//
//		// Print the size of the map
//		System.out.println("Size of map is: " + size);
//
//	}
//}