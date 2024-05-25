package com.anudip.practiceprograms;

// Write a Java program to display the cube of the given number up to an integer.

import java.util.Scanner;

public class Cubes {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number to get cube of given number up to that: ");
        
        // Read the integer input by the user
        int num = sc.nextInt(); 
        
        // Loop from 1 to the number entered by the user
        for (int i = 1; i <= num; i++) {
           
            int cube = i * i * i;  // Calculate the cube of the current number i
            
            System.out.println(i + "  :\t" + cube); // Print the current number and its cube
        }
        sc.close();
    }
}
// Dry Run for num = 5

// 1 :  1
// 2 :  8
// 3 :  27
// 4 :  64
// 5 :  125