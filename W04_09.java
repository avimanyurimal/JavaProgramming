package tutorial_workshop04;

public class W04_09 {

	public static void main(String[] args) {
		Address s1 = new Address();
		s1.setStreet("ramailo marg");
		s1.setCity("naxal");
		s1.setzipCode(44000);
		
		String street = s1.getStreet();
		String city = s1.getCity();
		int zipCode = s1.getzipCode();
		
		System.out.println("Street is: " + street);
		System.out.println("City is: " + city);
		System.out.println("Zip Code is: " + zipCode);

	}

}

class Address {
	private String street;
	private String city;
	private int zipCode;
	
	void setStreet(String s) {
		this.street = s;
	}
	String getStreet() {
		return street;
	}
	
	void setCity(String c) {
		this.city = c;
	}
	String getCity() {
		return city;
	}
	
	void setzipCode(int z) {
		this.zipCode = z;
	}
	int getzipCode() {
		return zipCode;
	}
	
}
