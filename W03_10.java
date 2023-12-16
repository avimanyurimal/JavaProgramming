package tutorialworkshop_03;

public class W03_10 {

    public static void main(String[] args) {
        double[] array = { 2.5, 4.7, 1.2, 3.8, 2.1 };
        double max = Double.MIN_VALUE;

        for (double num : array) {
            if (num > max) {
                max = num;
            }
        }

        System.out.println("Maximum value in the array: " + max);
    }
}