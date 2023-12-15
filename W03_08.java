package tutorialworkshop_03;

public class W03_08 {

	public static void main(String[] args) {
        int arr[] = {5, 4, 3, 10, 1};
        int i, j;

        int length = arr.length;
        for (i = 0; i < length; i++) {
            for (j = 1; j < length - i; j++) {
                if (arr[j - 1] > arr[j]) {
                    // Swap elements
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;

                    // Print the current state of the array
                    for (int k = 0; k < length; k++) {
                        System.out.print(arr[k] + " ");
                    }
                    System.out.println();
                }
            }
        }
    }
}