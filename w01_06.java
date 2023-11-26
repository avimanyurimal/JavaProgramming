package tutorial_workshop_01;

import java.util.Scanner;

public class w01_06 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a temperature in celcius c:");
		double c = scanner.nextDouble();
		
		double Tofahrenheit = TemperatureInFahrenheit(c);
		System.out.println("Temperature in Fahrenheit is: " + Tofahrenheit);
		
		scanner.close();

	}
	
	public static double TemperatureInFahrenheit(double c) {
		double Tofahrenheit = c * 9 / 5 + 32;
		return Tofahrenheit;
		
	}
	
}
