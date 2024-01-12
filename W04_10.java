package tutorial_workshop04;

public class W04_10 {

	public static void main(String[] args) {
		Customer s1 = new Customer(52525, "Araa", 273832);
		s1.setcustomerId(3355);
		s1.setname("haraa");
		s1.setBankAccount(988766);
		
		int customerid = s1.getcustomerId();
		String name = s1.getname();
		int bankaccount = s1.getBankAccount();
		
		System.out.println("CustomerID is: " + customerid);
		System.out.println("Name is: " + name );
		System.out.println("Bank Account is: " + bankaccount);

	}

}

class Customer{
	private int customerId;
	private String name;
	private int BankAccount;
	
	public Customer(int customerId, String name, int BankAccount) {
		this.customerId = customerId;
		this.name = name;
		this.BankAccount = BankAccount;
	}
	
	void setcustomerId(int c) {
		this.customerId = c;
	}
	int getcustomerId() {
		return customerId;
	}
	
	void setname(String n) {
		this.name = n;
	}
	String getname() {
		return name;
	}
	
	void setBankAccount(int b) {
		this.BankAccount = b;
	}
	int getBankAccount() {
		return BankAccount;
	}
}