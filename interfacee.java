package tutorialworkshop_06;

public class interfacee {

	public static void main(String[] args) {
		Hello s1 = new Hello();
		s1.mileage();
		s1.model();

	}

}
interface Scooter {
	void mileage();
}

interface Brand {
	void model();
}

class Hello implements Scooter,Brand{
	@Override
	public void mileage() {
		System.out.println("MAx milages of 55 km /hr");	
	}
	
	@Override
	public void model() {
		System.out.println("model is  tesla");
		
	}
}

