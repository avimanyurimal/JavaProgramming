package tutorialworkshop_02;

import java.util.Scanner;

public class W02_03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the age:");
		int age = scanner.nextInt();

		scanner.close();
		
		if (age <= 18) {
			System.out.println("you are  Youngest.");
		}else {
			System.out.println("You are oldest.");
		}
	}

}
