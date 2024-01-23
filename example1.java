package tutorialworkshop_06;

public class example1 {

	public static void main(String[] args) {
		Bike s1 = new Honda();
		s1.changeGear();
		s1.run();
	}

}

abstract class Bike{
	Bike(){
		System.out.println("Bike  constructor is created");
	}
	
	abstract void run();
	void changeGear() {
		System.out.println("Gear changed");
	}
}

class Honda extends Bike{
	void run() {
		System.out.println("running safely");
	}
}
