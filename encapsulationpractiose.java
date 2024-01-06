package tutorial_workshop04;

public class encapsulationpractiose {

	public static void main(String[] args) {
		Bank s1 = new Bank();
		s1.setName("Nabil");
		s1.setBankId(234);
		s1.setAddress("chabahil");
		
		String Name = s1.getName();
		int BankId = s1.getBankId();
		String Address = s1.getAddress();
		
		System.out.println("Name is: "+ Name);
		System.out.println("Bank ID is:" + BankId);
		System.out.println("Address is: " + Address);

	}

}

class Bank{
	private String Name;
	private int BankId;
	private String Address;
	
	
	void setName(String a) {
		this.Name = a;
	}
	String getName() {
		return Name;
	}
	
	void setBankId(int i) {
		this.BankId = i;
	}
	int getBankId() {
		return BankId;
	}
	
	void setAddress(String a) {
		this.Address = a;
	}
	String getAddress() {
		return Address;
	}
	
}
