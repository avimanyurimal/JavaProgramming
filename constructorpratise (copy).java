package tutorial_workshop04;

public class constructorpratise {

	public static void main(String[] args) {
		BankkAccccount s1 = new BankkAccccount(56999, "Maya", "ktm");
		s1.detailsofbanktodisplay();

	}

}
class BankkAccccount{
	int Balance;
	String Name;
	String Address;
	
	public BankkAccccount(int Balance, String Name, String Address) {
		this.Name = Name;
		this.Balance = Balance;
		this.Address = Address;
		
	}
	
void detailsofbanktodisplay() {
	System.out.println("Name is: " + Name);
	System.out.println("bakance is : " + Balance);
	System.out.println("Address is :" + Address);
	
	}

}
