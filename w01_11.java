package tutorial_workshop_01;

import java.util.Scanner;

public class w01_11 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the distance in miles m:");
		double m = scanner.nextDouble();
		
		double kilometers = InKilometers(m);
		System.out.println("In kilometers: " +kilometers);
		
		scanner.close();
		
	}
	
	public static double InKilometers(double m) {
		double kilometers = m * 1.609;
		return kilometers;
	}

}
