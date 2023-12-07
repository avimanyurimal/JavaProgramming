package tutorialworkshop_02;
import java.util.Scanner;
public class W02_14 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number as a string: ");
        String strNumber = scanner.nextLine();

        try {
            int intValue = Integer.parseInt(strNumber);
            System.out.println("String to Int Conversion: " + intValue);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid number as a string.");
        }

        System.out.print("Enter an integer: ");
        int intValue = scanner.nextInt();
        
        scanner.nextLine();

        String strFromInt = String.valueOf(intValue);

        System.out.println("Int to String Conversion: " + strFromInt);

        scanner.close();
    }

}
