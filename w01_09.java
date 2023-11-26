package tutorial_workshop_01;

import java.util.Scanner;

public class w01_09 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the number a:");
		int a = scanner.nextInt();
		
		System.out.println("Enter the number b:");
		int b = scanner.nextInt();
		
		int addition = a + b;
		System.out.println("Addition: " +addition);
		int subtraction = a - b;
		System.out.println("Subtraction: " +subtraction);
		int multiplication = a * b;
		System.out.println("Multiplication: " +multiplication);
		int division = a / b;
		System.out.println("Division: " +division);
		
		scanner.close();

	}

}
