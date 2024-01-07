package tutorial_workshop04;

public class T04_15_encapsulation {

	public static void main(String[] args) {
		Person s1 = new Person();
		
		s1.setAge(20);
		s1.setName("Avimanyu");
		
		int Age = s1.getAge();
		String Name = s1.getName();
		
		System.out.println("My Age is: " + Age);
		System.out.println("My Name is: " + Name);
		

	}

}
class Person{
	private int age;
	private String name;
	
	void setAge(int a) {
		this.age = a;
	}
	int getAge() {
		return age;
	}
	
	void setName(String b) {
		this.name = b;
	}
	String getName() {
		return name;
	}
}