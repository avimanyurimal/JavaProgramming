package tutorial_workshop_01;

import java.util.Scanner;

public class w01_12 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the radius of circle:");
		double r = scanner.nextDouble();
		
		double area = AreaOfCircle(r);
		System.out.println("Area Of circle: "+area);
		
		scanner.close();

	}
	
	public static double AreaOfCircle(double r) {
		double area = Math.PI * r * r;
		return area;
	}

}
