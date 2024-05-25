// Write a java programs to perform basic calculators operations(Input from user using switch case)
package com.anudip.lab3;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Choose an operation (+, -, *, /): ");
        char operation = scanner.next().charAt(0);

        double result = 0; // Initialize result variable

        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero!");
                    return; // Exit the program
                }
                break;
            default:
                System.out.println("Error: Invalid operation!");
                return; // Exit the program
        }

        System.out.println("The result is: " + result);

        scanner.close();
    }
}
// Dry Run:
// Enter the first number: 10
// Enter the second number: 5
// Choose an operation (+, -, *, /): +
// The result is: 15