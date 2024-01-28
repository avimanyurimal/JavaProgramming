package tutorialworkshop09;
import java.util.*;
public class Qn9 {

	public static void main(String[] agrs) {
		Stack <String> s = new Stack<>();
		
		//Adding element in the Stack
		s.push("A");
		s.push("B");
		s.push("C");
		
		//Displaying the stack
		System.out.println(s);
		
		//pop method in stack
		s.pop();
		System.out.println(s);
		
		//again pushing D and E in the stack
		s.push("D");
		s.push("E");
		
		//Displaying the stack
		System.out.println(s);
		
		//peek methods in stack and displaying the stack
		s.peek();
		System.out.println(s);

	}
}
