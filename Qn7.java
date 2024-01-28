package tutorialworkshop09;
import java.util.*;
public class Qn7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <String> names1 = new ArrayList<>();
		ArrayList<String> names2 = new ArrayList<>();
		
		
		//adding element in names1
		names1.add("Samyog");
		names1.add("Surendra");
		names1.add("Bisekh");
		names1.add("Avimanyu");
		
		System.out.println(names1);
		
		names2.add("Lochan Sir");
		names2.add("Himani");
		names2.add("Nischal");
		
		System.out.println(names2);
		
		names2.addAll(names1);
		System.out.println(names2);
	}

}
