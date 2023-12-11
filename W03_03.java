package tutorialworkshop_03;
import java.util.Scanner;

public class W03_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userInput;
        
        do {
            System.out.print("Enter a number (enter 0 to exit): ");
            userInput = scanner.nextInt();

            if (userInput != 0) {
                System.out.println("You entered: " + userInput);
            }

        } while (userInput != 0);
        
        System.out.println("Program exited. Thank you!");
        scanner.close();
    }
}
