package tutorial_workshop04;

import java.util.Scanner;

public class one {

	public static void main(String[] args) {
		int n , sum = 0;
		float average;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of element you want in the array: ");
		n = s.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the all elements:");
		for (int i = 0; i < n; i++) {
			a[i] = s.nextInt();
			sum = sum + a[i];
		}
		System.out.println("Sum:" +sum);
		average = (float) sum / n;
		System.out.println("Average:" + average);
		s.close();
		

	}
	
}	