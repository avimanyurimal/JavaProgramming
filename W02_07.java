package tutorialworkshop_02;

import java.util.Scanner;

public class W02_07 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Enter a number:");
	        int x = scanner.nextInt();

	        if (x > 5 && x < 15) {
	            System.out.println("The value of x is: " + x);
	        } else {
	            System.out.println("The value of x does not meet the conditions.");
	        }

	        scanner.close();
	    }
	}
