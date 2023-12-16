package tutorialworkshop_03;

public class W03_11 {

	public static void main(String[] args) {
		int[][] array = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int sum = 0;

        for (int[] row : array) {
            for (int num : row) {
                sum += num;
            }
        }

        System.out.println("Sum of all elements in the 2D array: " + sum);
   }

}
