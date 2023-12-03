package tutorialworkshop_02;
import java.util.Scanner;

public class T02_ifelse {

	public static void main(String[] args) {
		int num;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		num = input.nextInt();
		if(num>0) {
			System.out.println("It is a positive Number.");
		}else if(num<0) {
			System.out.println("It is a negative number.");
		}else {
			System.out.println("It is not a number.");
			
		}
		 input.close();

	}


}
