package tutorialworkshop_02;
import java.util.Scanner;
public class W02_01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the length of rectangle:");
		double length = scanner.nextDouble();
		
		System.out.println("Entetr the breadth of rectangle:");
		double breadth = scanner.nextDouble();
		
		scanner.close();
		
		if (length == breadth) {
			System.out.println("it is square");
		}else {
			System.out.println("It is not square");
		}

	}

}
