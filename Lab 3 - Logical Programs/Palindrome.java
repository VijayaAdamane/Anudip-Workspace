// WAP to check whether the number is palindrome or not.

package com.anudip.lab3;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number to check if it is a palindrome
        System.out.print("Enter a number to check if it is a palindrome: ");
        int number = scanner.nextInt(); // Read the number

        // Check if the number is a palindrome
        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }

        // Close the scanner object
        scanner.close();
    }

    // Method to check if a number is a palindrome
    public static boolean isPalindrome(int num) {
        int originalNum = num; // Store the original number
        int reversedNum = 0; // Initialize reversed number to 0

        // Reverse the number
        while (num != 0) {
            int digit = num % 10; // Get the last digit
            reversedNum = reversedNum * 10 + digit; // Add the digit to the reversed number
            num /= 10; // Remove the last digit from the number
        }

        // Check if the original number is equal to its reverse
        return originalNum == reversedNum;
    }
}

/*

User enters 121.

number is assigned the value 121.

originalNum is assigned the value 121.

reversedNum is initialized to 0.

The while loop starts : 

First iteration:
    digit is 121 % 10 = 1.
    reversedNum is 0 * 10 + 1 = 1.
    num is 121 / 10 = 12.
Second iteration:
    digit is 12 % 10 = 2.
    reversedNum is 1 * 10 + 2 = 12.
    num is 12 / 10 = 1.
Third iteration:
    digit is 1 % 10 = 1.
    reversedNum is 12 * 10 + 1 = 121.
    num is 1 / 10 = 0.
The loop ends as num becomes 0.

The method returns true because originalNum (121) is equal to reversedNum (121).
The main method prints "121 is a palindrome".
 */