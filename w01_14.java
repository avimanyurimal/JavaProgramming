package tutorial_workshop_01;

import java.util.Scanner;

public class w01_14 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a amount in us dollar d:");
		double d = scanner.nextDouble();
		
		System.out.println("Enter a exchange rate r:");
		double r = scanner.nextDouble();
		
		double convert = ConvertAmount(d, r);
		System.out.println("Converted Amount In Rupees:" +convert);
		
		scanner.close();
		
	}
	
	public static double ConvertAmount(double d, double r) {
		double convert = d * r;
		return convert;
	}

}
