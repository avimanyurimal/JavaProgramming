package tutorialworkshop09;
import java.util.*;
public class Qn6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList <Integer> ll = new LinkedList<>();
		LinkedList <Integer> llReversed = new LinkedList<>();
		
		ll.add(1);
		ll.add(2);
		ll.add(3);
		ll.add(4);
		ll.add(5);
		ll.add(6);
		

		//reversing the array
		for (int i=ll.size()-1;i>=0;i--) {
			llReversed.add(ll.get(i));
		}
		
		System.out.println(llReversed);
		
		
	}

}
