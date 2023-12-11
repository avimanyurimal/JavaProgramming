package tutorialworkshop_03;
import java.util.Scanner;
public class W03_02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = input.nextInt();
		input.close();
		
		long fact = 1;
		int num = 1;
		while(num <= n) {
			fact = fact * num;
			num++;
		}
		System.out.println("factorial of number is "+n+" is:"+fact);
	}

}
