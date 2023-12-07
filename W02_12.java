package tutorialworkshop_02;

import java.util.Scanner;

public class W02_12 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter an integer: ");
	        int intValue = scanner.nextInt();
	        
	        long longValue = intValue;
	        float floatValue = intValue; 

	        System.out.println("Widening Type Casting:");
	        System.out.println("1. Integer: " + intValue);
	        System.out.println("2. Long: " + longValue);
	        System.out.println("3. Float: " + floatValue);

	        scanner.close();
	    }
	}
