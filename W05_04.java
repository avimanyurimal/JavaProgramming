package tutorialworkshop05;

public class W05_04 {

	public static void main(String[] args) {
		Employee s1 = new Employee("Narra", "mineproperty");
			s1.details();
	}

}

class Person {
	protected String address;
//for not to use super class not said in question so
//	public Person(String address) {
//		this.address = address;
//	}
	
}

class Employee extends Person{
	String Property;
	
	public Employee(String address, String Property) {
// for the use of constructor use super class to call
//		super(address);
		this.Property = Property;
		this.address = address; // adding this for while not using super class
	}
	
	
	void details() {
		System.out.println("Address is: " + address);
		System.out.println("Property is: " + Property);
	}
}
