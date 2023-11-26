package tutorial_workshop_01;

import java.util.Scanner;

public class w01_13 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the quantity of items q:");
		double q = scanner.nextDouble();
		
		System.out.println("Enter the price per items p:");
		double p = scanner.nextDouble();
		
		double cost = TotalCost(q, p);
		System.out.println("Total cost:" +cost);
		
		scanner.close();

	}
	
	public static double TotalCost(double q, double p) {
		double cost = q * p;
		return cost;
	}

}
