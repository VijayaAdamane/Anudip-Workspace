// Write a java programs to perform basic calculators operations(Input from user using switch case)
package com.anudip.lab3;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble(); // Read the first number

        // Prompt the user to enter the second number
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble(); // Read the second number

        // Prompt the user to choose an operation
        System.out.print("Choose an operation (+, -, *, /): ");
        char operation = scanner.next().charAt(0); // Read the operation character

        double result = 0; // Initialize result variable

        // Use switch case to perform the chosen operation
        switch (operation) {
            case '+':
                result = num1 + num2; // Addition
                break;
            case '-':
                result = num1 - num2; // Subtraction
                break;
            case '*':
                result = num1 * num2; // Multiplication
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2; // Division
                } else {
                    System.out.println("Error: Division by zero!");
                    return; // Exit the program if division by zero is attempted
                }
                break;
            default:
                System.out.println("Error: Invalid operation!"); // Handle invalid operation
                return; // Exit the program if an invalid operation is chosen
        }

        // Display the result of the operation
        System.out.println("The result is: " + result);

        // Close the scanner object
        scanner.close();
    }
}


/*
 The program starts and a Scanner object is created to read input from the user.
 
 enter the first number - 10
num1 is assigned the value 10

Enter the second number. - 5.
num2 is assigned the value 5.

choose an operatio  - +.
operation is assigned the value +

The switch statement evaluates the value of operation.
The case + is matched.

result is assigned the value of num1 + num2 which is 10 + 5 = 15.
The program prints "The result is: 15".

The scanner object is closed and the program terminates.
 */