package tutorial_workshop04;

public class T04_12_add_method {

	public static void main(String[] args) {
		Carss s1 = new Carss();
		s1.model = 3;
		s1.company = "Tesla";
		s1.details();
	}

}
class Carss{
	int model;
	String company;
	void details() {
		System.out.println("Model: " + model);
		System.out.println("Company: " + company);
	}
}
