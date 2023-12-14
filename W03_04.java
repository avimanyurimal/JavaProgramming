package tutorialworkshop_03;

public class W03_04 {

    public static void main(String[] args) {
        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            // Loop to print spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            // Loop to print asterisks
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
}
