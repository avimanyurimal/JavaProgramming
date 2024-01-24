package tutorialworkshop09;
import java.util.*;
public class QN1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <String> studentNames = new ArrayList();
		ArrayList <String> studentNames2 = new ArrayList();
		ArrayList <Integer> studentNumber = new ArrayList();
		ArrayList <Object> schoolStudents = new ArrayList();
		
		//Add method in Java
		studentNames.add("Suren");
		studentNames.add("Samyog");
		studentNames.add("manyu");
		studentNames.add("pujan");
		
		//Printing the element stored inside the array list
		System.out.println(studentNames);
		
		//Remove MEthod in java
		studentNames.remove(1);
		System.out.println(studentNames);
		
		
		//Adding element in STudentNAmes2
		studentNames2.add("pass aaye");
		studentNames2.add("lovely haii");
		studentNames2.add("dhak dhak");
		studentNames2.add("Hehehaha");
		
		//Adding all element of StudentNames2 in Student Names
		studentNames.addAll(studentNames2);
		
		//Printing StudentNAmes
		System.out.println(studentNames);
		
		//Adding number in StudentNumber
		studentNumber.add(1);
		studentNumber.add(2);
		studentNumber.add(3);
		studentNumber.add(4);
		
		//Print the array of Student Number
		System.out.println(studentNumber);
		
		//Adding all array in schoolStudent Array
		schoolStudents.addAll(studentNames);
		schoolStudents.addAll(studentNames2);
		schoolStudents.addAll(studentNumber);
		
		
		//Printing schoolStudent
		System.out.println(schoolStudents);
	}

}
