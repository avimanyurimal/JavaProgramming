package tutorial_workshop_01;

import java.util.Scanner;

public class w01_04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the length of side a:");
		double a = scanner.nextDouble();
		
		System.out.println("Enter the breadth of side b:");
		double b = scanner.nextDouble();
		
		System.out.println("Enter the height of side c:");
		double c = scanner.nextDouble();
		
		double area = AreaOfTriangle(a, b, c);
		System.out.println("Area Of Triangle is: " + area );
	
		scanner.close();
		
	}
	
	public static double AreaOfTriangle(double a, double b, double c) {
		double s = (a + b + c) / 2;
		double area = Math.sqrt(s * (s-a)* (s-b) * (s-c));
		return area;
		
	}
	
}
