package tutorial_workshop_01;

import java.util.Scanner;

public class w01_08 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a principal amount p:");
		double p = scanner.nextDouble();
		
		System.out.println("Enter a rate of interest r:");
		double r = scanner.nextDouble();
		
		System.out.println("Enter a time period t:");
		double t = scanner.nextDouble();
		
		double simpleinterest = SimpleInterest(p, r, t);
		System.out.println("Simple Interest: " + simpleinterest);
		
		scanner.close();

	}
	
	public static double SimpleInterest(double p, double r, double t) {
		double simpleinterest = (p * t * r) / 100;
		return simpleinterest;
	}

}
