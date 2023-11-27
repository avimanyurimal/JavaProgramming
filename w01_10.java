package tutorial_workshop_01;

import java.util.Scanner;

public class w01_10 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the length of rectangle l:");
		double l = scanner.nextDouble();
		
		System.out.println("Enter the width of rectangle b:");
		double w = scanner.nextDouble();
		
		double perimeter = PerimeterOfRectangle(l, w);
		System.out.println("Perimeter of rectangle is: " +perimeter);
		
		scanner.close();	
		
	}
	
	public static double PerimeterOfRectangle(double l, double w) {
		double perimeter = 2 * (l + w);
		return perimeter;
	}

}
