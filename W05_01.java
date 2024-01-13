package tutorialworkshop05;

public class W05_01 {

	public static void main(String[] args) {
		Dog s1 = new Dog("moye", 21, "posori");
		s1.breed();
	}

}

class Animal{
	String name;
	int age;
	
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
}

class Dog extends Animal{
	String breed;
	
	public Dog(String name, int age, String breed) {
		super(name, age);
		this.breed = breed;
	}

	void breed() {
			System.out.println("Breed is: " + breed);	
	
	}
}