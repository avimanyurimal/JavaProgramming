package tutorialworkshop_02;
import java.util.Scanner;
public class W02_13 {
	public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter a double: ");
	        double doubleValue = scanner.nextDouble();
	        
	        long longValue = (long) doubleValue;
	        
	        int intValue = (int) longValue;

	        System.out.println("Narrowing Type Casting:");
	        System.out.println("1. Double: " + doubleValue);
	        System.out.println("2. Long from Double: " + longValue);
	        System.out.println("3. Int from Long: " + intValue);

	        scanner.close();
	    }
}

