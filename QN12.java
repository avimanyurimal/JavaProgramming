package tutorialworkshop09;
import java.util.*;
public class QN12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet <String> hs = new HashSet<>();
		HashSet <Integer> num = new HashSet<>();
		//adding the element the set
		hs.add("Surendra");
		hs.add("Hello");
		hs.add("Lovely");
		
		num.add(1);
		num.add(2);
		num.add(3);
		
		//displaying the sets
		System.out.println(hs);
		System.out.println(num);
		
		//Removing the elements
		hs.remove("Hello");
		num.remove(3);
		
		//displaying the sets
		System.out.println(hs);
		System.out.println(num);
		
		//claering the sets
		hs.clear();
		num.clear();
		
		//displaying the sets
		System.out.println(hs);
		System.out.println(num);
	}

}
