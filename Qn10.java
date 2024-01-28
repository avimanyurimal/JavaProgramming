package tutorialworkshop09;
import java.util.*;
public class Qn10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue <String> eq = new LinkedList<>();
		
		//adding element in the queue
		eq.add("A");
		eq.add("B");
		eq.add("C");
		
		System.out.println(eq);
		
		//removing A
		eq.remove("A");
		System.out.println(eq);
		
		//adding element D and E in the Queue
		eq.add("D");
		eq.add("E");
		System.out.println(eq);
		
		//peek method in Queue
		eq.peek();
		System.out.println(eq);
		
		
	}

}
