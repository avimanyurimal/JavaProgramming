package tutorial_workshop04;

public class T04_02 {

	public static void main(String[] args) {
		Car s1 = new Car();
		s1.make = "Tesla";
		s1.model = 3;
		s1.year = 2023;
		s1.cardetails();
		

	}

}

class Car {
	String make;
	int model;
	int year;
	
	void cardetails() {
		System.out.println("Make: " + make);
		System.out.println("Model: " + model);
		System.out.println("Year: " + year);
	}
}


class tesla extends Car {
	void start() {
		System.out.println("Car is stsring");
	}
}