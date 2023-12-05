package tutorialworkshop_02;
import java.util.Scanner;

public class W02_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your grade: ");
        char grade = scanner.next().charAt(0);

        switch (grade) {
            case 'A':
                System.out.println("Excellent !");
                break;
            case 'B':
                System.out.println("Outstanding !");
                break;
            case 'C':
                System.out.println("Good !");
                break;
            case 'D':
                System.out.println("Can do better !");
                break;
            case 'E':
                System.out.println("Just Passed !");
                break;
            case 'F':
                System.out.println("You Failed !");
                break;
            default:
                System.out.println("Invalid grade!");
        }

        scanner.close();
    }
}
