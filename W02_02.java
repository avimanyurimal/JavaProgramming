package tutorialworkshop_02;

import java.util.Scanner;

public class W02_02 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the marks:");
        int marks = input.nextInt();
        
        if (marks >= 40 && marks < 50) {
            System.out.println("You obtain grade C.");
        } else if (marks >= 50 && marks < 60) {
            System.out.println("You obtain grade C+.");
        } else if (marks >= 60 && marks < 70){
            System.out.println("You obtain grade B.");
        } else if (marks >= 70 && marks < 80) {
        	System.out.println("You obtain grade B+");
        } else if (marks >= 80 && marks < 90) {
        	System.out.println("You obtain grade A");
        }else if (marks >= 90) {
        	System.out.println("You obtain A+");
        }

        input.close();
    }
}
