package tutorialworkshop_02;

import java.util.Scanner;

public class W02_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        // String methods
        System.out.println("a. Length of str1: " + str1.length());
        System.out.println("b. Comparison (compareTo): " + str1.compareTo(str2));
        System.out.println("c. Character at index 0 in str1: " + str1.charAt(0));
        System.out.println("d. Substring of str1 from index 1 to end: " + str1.substring(1));
        System.out.println("e. Equality check (equals): " + str1.equals(str2));
        System.out.println("f. Uppercase of str1: " + str1.toUpperCase());
        System.out.println("g. Lowercase of str1: " + str1.toLowerCase());

        scanner.close();
    }
}
