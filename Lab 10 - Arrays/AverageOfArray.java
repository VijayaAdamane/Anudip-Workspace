// Write a Java program to calculate the average value of array elements
package com.anudip.lab10;

import java.util.Scanner;

public class AverageOfArray {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of array: ");
        int length = scanner.nextInt(); // Read the length of the array

        // Initialize an array of floats with the specified length
        float[] array = new float[length];
        float sum = 0; // Initialize sum to 0 
        
        // ask the user to enter the values of the array
        System.out.print("Enter the array values: ");
        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextFloat(); 
            sum += array[i]; // Add the value to the sum
        }

        // Calculate the average of the array elements
        float average = sum / length;

        // Print the average
        System.out.println("Average of array elements is: " + average);

        scanner.close();
    }
}


/*
 	-- Dry Run --
Inputs:
length = 5
array values: 10.0, 20.0, 30.0, 40.0, 50.0

Iterations:
i = 0: array[0] = 10.0, sum = 10.0
i = 1: array[1] = 20.0, sum = 30.0
i = 2: array[2] = 30.0, sum = 60.0
i = 3: array[3] = 40.0, sum = 100.0
i = 4: array[4] = 50.0, sum = 150.0

average = sum / length = 150.0 / 5 = 30.0

Output:
"Average of array elements is: 30.0"
 
 
 */