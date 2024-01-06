package tutorial_workshop04;

class Intro {
		String name;
		int age;
		String course;
		Intro(){
			System.out.println("Hello Mayalu");
		}
		public void printDetails() {
			System.out.println("Name :" + name);
			System.out.println("Age :" + age);
			System.out.println("Course :" + course);
	}
		
}		
public class students {
	public static void main(String[] args) {
		Intro s1 = new Intro();
		s1.name ="samyogi";
		s1.age = 27;
		s1.course = "nursing";
		s1.printDetails();
		Intro s2 = new Intro();
		s2.name ="samyog";
		
	}
	
}
