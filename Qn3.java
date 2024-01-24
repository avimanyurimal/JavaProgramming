package tutorialworkshop09;
import java.util.*;
public class Qn3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input  = new Scanner(System.in);
		ArrayList <Integer> rollNum = new ArrayList();
		
		rollNum.add(3);
		rollNum.add(4);
		rollNum.add(5);
		rollNum.add(6);
		rollNum.add(7);
		rollNum.add(8);
		rollNum.add(9);
		
		ArrayList <Integer> evenNum = new ArrayList();
		for (int value: rollNum) {
			if(value%2==0) {
//				System.out.println(value);
				evenNum.add(value);
			}
		}
		
		//displaying evenNumber Array
		System.out.println(evenNum);
	}

}
