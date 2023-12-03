package tutorialworkshop_02;

import java.util.Scanner;

public class T02_07 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the first number:");
		int a = scanner.nextInt();
		
		System.out.println("Enter the second number:");
		int b = scanner.nextInt();
		
		scanner.close();
	
		if(a > b) {
			System.out.println("The first number a is greatest.");
		}else {
			System.out.println("The second number b is greatest.");
		}
	}

}
