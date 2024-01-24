package tutorialworkshop09;
import java.util.*;
public class Qn2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList <String> studentNames = new LinkedList();
		
		
		//Add method in Java
		studentNames.add("Surendra");
		studentNames.add("Samyog");
		studentNames.add("Avimanyu");
		studentNames.add("pujan");
		
		//Printing the element stored inside the array list
		System.out.println(studentNames);
		
		//Remove MEthod in java
		studentNames.remove(1);
		System.out.println(studentNames);
		
		
		//inserting element in 1st and last position
		studentNames.addFirst("Lochan Sir");
		studentNames.addLast("Ronaldo");
		
		//Displaying
		System.out.println(studentNames);
		
		//checking empty or not
		System.out.println(studentNames.isEmpty());
	}

}
