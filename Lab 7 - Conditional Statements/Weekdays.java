
// Write a Java program that takes a number from the user and generates an integer between 1 and 7. It displays the weekday name.
import java.util.Scanner;

public class Weekdays {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a number between 1 and 7: ");
		int dayNumber = scanner.nextInt();

		// Print the corresponding weekday based on the entered number
		switch (dayNumber) {
			case 1:
				System.out.println("Monday");
				break;
			case 2:
				System.out.println("Tuesday");
				break;
			case 3:
				System.out.println("Wednesday");
				break;
			case 4:
				System.out.println("Thursday");
				break;
			case 5:
				System.out.println("Friday");
				break;
			case 6:
				System.out.println("Saturday");
				break;
			case 7:
				System.out.println("Sunday");
				break;
			default:
				System.out.println("Invalid Input. Please enter a number between 1 and 7.");
		}
		scanner.close();
	}
}

// Dry Run:
// Enter a number between 1 and 7: 3
// Wednesday