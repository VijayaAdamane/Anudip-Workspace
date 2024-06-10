// Write a Java program to test if a given string contains the specified sequence of char values.
package com.LabStrings;
import java.util.Scanner;

public class ContainsCharSeq {

  public static void main(String[] args) {
    // Create a Scanner object to read user input
    Scanner scanner = new Scanner(System.in);

    System.out.println("This is a program to test if a given string contains the specified sequence of char values");

    // Prompt the user to enter a string
    System.out.print("Enter a string: ");
    String str = scanner.nextLine();

    // Prompt the user to enter a sequence of characters
    System.out.print("Enter a sequence of characters: ");
    String sequence = scanner.nextLine();

    // Check if the string contains the sequence using the contains() method
    if (str.contains(sequence)) {
      System.out.println("The string contains the sequence");
    } else {
      System.out.println("The string does not contain the sequence");
    }
    
    scanner.close();
  }
}