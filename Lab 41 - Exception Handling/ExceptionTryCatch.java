// Write a Java program that throws an exception and catch it using a try-catch block.
package com.lab41;

public class ExceptionTryCatch {

	public static void main(String[] args) {
		try {
			// Throw an ArithmeticException
			int result = divideNumbers(10, 0);
			System.out.println("Result of division: " + result);
		} catch (ArithmeticException e) {
			// Catch and handle the ArithmeticException
			System.out.println("Exception caught: " + e.getMessage());
		}
	}

	// Method that throws an ArithmeticException
	public static int divideNumbers(int dividend, int divisor) {
		if (divisor == 0) {
			// Throw an ArithmeticException if divisor is 0
			throw new ArithmeticException("Division by zero is not allowed.");
		}
		return dividend / divisor;
	}
}