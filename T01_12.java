package tutorial_workshop_01;
import java.util.Scanner;
public class T01_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();
        
        int sum = number1 + number2;
        System.out.println("The sum of the two numbers is: " + sum);
        
        scanner.close();
    }
}