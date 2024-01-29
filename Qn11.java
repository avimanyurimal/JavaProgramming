package tutorialworkshop09;
import java.util.*;
public class Qn11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet <Integer> hs = new HashSet<>();
		
		hs.add(1);
		hs.add(2);
		hs.add(3);
		
//		System.out.println(hs);
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number to add in HashSet: ");
		int user = input.nextInt();
		
		
		if(hs.contains(user)==true) {
			System.out.println("Element already exits in the HashSet,Try Again");
				
		}else {
			hs.add(user);
			System.out.println("Element added Succesfully");
		}
		
		//displaying the updated Set
		System.out.println("Updated Set: "+hs);
		
		
		input.close();
	}

}
