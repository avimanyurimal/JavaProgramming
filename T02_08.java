package tutorialworkshop_02;

import java.util.Scanner;

public class T02_08 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the marks:");
        int marks = input.nextInt();
        if (marks < 50) {
            System.out.println("Sorry You are Fail.");
        } else if (marks >= 50 && marks < 60) {
            System.out.println("You obtain grade C.");
        } else if (marks >= 60 && marks < 70) {
            System.out.println("You obtain grade B.");
        } else {
            System.out.println("You obtain grade A.");
        }

        input.close();
    }
}
