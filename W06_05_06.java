package tutorialworkshop_06;

public class W06_05_06 {

	public static void main(String[] args) {
		Vehicle v = new Bus();
		v.wheel();
		v.door();
	}
}

abstract class Vehicle{
	abstract void wheel();
	
	abstract void door();
}

class Bus extends Vehicle{
	void wheel() {
		System.out.println("Wheel");
	}
	
	void door() {
		System.out.println("door");
	}
}
