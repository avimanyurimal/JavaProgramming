package tutorialworkshop05;

public class W05_05 {

	public static void main(String[] args) {
		Child s1 = new Child ("hello", "it", "baby", "18");
		s1.details();

	}

}

class Parent {
	String name; //default private okay
	protected String aim;
	public String hobby;

	public Parent(String name) {
		this.name = name;
	}
}

class Child extends Parent{
	String age;
	
	public Child (String name, String aim, String hobby, String age) {
		super(name);
		this.aim = aim;
		this.hobby = hobby;
		this.age = age;
	}
	void details() {
		System.out.println("Name is: " + name);
		System.out.println("Aim is: " + aim);
		System.out.println("Hobby is: " + hobby);
		System.out.println("Age is: " + age);
	}
}
