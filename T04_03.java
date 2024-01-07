package tutorial_workshop04;

public class T04_03 {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.name = "John";
		s1.roll_no = 2; 
		s1.studentdetails();
	}

}

class Student {
	String name;
	int roll_no;
	
	void studentdetails() {
		System.out.println("Student Name: " + name);
		System.out.println("Roll number: " + roll_no);
	}
}
