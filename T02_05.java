package tutorialworkshop_02;

import java.util.Scanner;

public class T02_05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Kindly Please enter the age: ");
		int age = scanner.nextInt();
		
		scanner.close();
		
		if (age >= 18) {
			System.out.println("You are eligible to vote.");
		}else {
			System.out.println("You are not eligible to vote.");
		}

	}
}
