package tutorialworkshop09;
import java.util.*;
public class Qn8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <String> names1 = new ArrayList<>();
		ArrayList<String> names2 = new ArrayList<>();
		
		
		//adding element in names1
		names1.add("Samyog");
		names1.add("Surendra");
		names1.add("Bisekh");
		names1.add("Avimanyu");
		names1.add("Moye Moye");
		names1.add("Lovely");
		
		System.out.println(names1);
		
		for(int i=2;i<=names1.size()-1;i++) {
			names2.add(names1.get(i));
		}
		
		System.out.println(names2);
	}

}
