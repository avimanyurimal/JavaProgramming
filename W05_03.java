package tutorialworkshop05;

public class W05_03 {

	public static void main(String[] args) {
		Dogss s1 = new Dogss("Pinky", "Honky");
		s1.displaydetails();
	}

}

class Animals {
	String name;
	
	public Animals(String name) {
		this.name= name;
	}
}
class Dogss extends Animals{
	String breed;
	
	public Dogss(String name, String breed){
		super(name);
		this.breed = breed;
	}
	void displaydetails() {
		System.out.println("Name is: " + name);
		System.out.println("Breed is: " + breed);
	}
}
