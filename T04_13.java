package tutorial_workshop04;

public class T04_13 {

	public static void main(String[] args) {
		Carsss car1 = new Carsss();
		car1.model = 3;
		car1.company = "Tesla";
		car1.displaydetails();
		
		Carsss car2 = new Carsss();
		car2.model = 4;
		car2.company = "Farari";
		car2.displaydetails();

	}

}

class Carsss{
	int model;
	String company;
	
	void displaydetails() {
		System.out.println("Model: " + model);
		System.out.println("Company:" + company);
	}
}