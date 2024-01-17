package tutorialworkshop_06;

public class W06_10_11_12_13 {
	public static void main(String[] args) {
		LivingBeing l = new Fish();
		l.specialFeature();
		LivingBeing b = new Bird();
		b.specialFeature();
	}
}

interface LivingBeing{
	void specialFeature();
}

class Fish implements LivingBeing{
	public void specialFeature() {
		System.out.println("Special feature of Fish: ");
		System.out.println("Fish can breath underwater. ");
		System.out.println("They cannt see water. \n");
	}
}

class Bird implements LivingBeing{
	public void specialFeature() {
		System.out.println("Special feature of bird: ");
		System.out.println("Bird can fly in the sky. ");
		System.out.println("They cannot see air. ");
	}
}