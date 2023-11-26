package tutorial_workshop_01;

import java.util.Scanner;

public class w01_05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the length of the one side l:");
		double l = scanner.nextDouble();
		
		double area = AreaOfSquare(l);
		System.out.println("Area Of Square is: " + area);
		
		scanner.close();
		
	}
	
	public static double AreaOfSquare(double l){
		double area = l * l;
		return area;
				
	}

}
