package tutorial_workshop_01;

import java.util.Scanner;

public class w01_07 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a radius of the cylinder r:");
		double r = scanner.nextInt();
		
		System.out.println("Enter a height of the cylinder h:");
		double h = scanner.nextInt();
		
		double volume = VolumeOfCylinder(r, h);
		System.out.println("Volume of Cylinder is:" + volume);
		
		scanner.close();

	}
	
	public static double VolumeOfCylinder(double r, double h) {
		double volume = Math.PI * r * r * h;
		return volume;

	}
	
}