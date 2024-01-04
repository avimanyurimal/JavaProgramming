package tutorial_workshop04;

public class BankAccount {
	
	public static void main(String[] args) {
		bankAccount s1 = new bankAccount();
		s1.accountNumber =7874784;
		s1.balance=7373757;
		s1.accountHolderName="Maya";
		s1.accountHolderAddress="kathmandu";
		s1.details();
	}

}

class bankAccount{
	int accountNumber;
	double balance;
	String accountHolderName;
	String accountHolderAddress;
	void details() {
		System.out.println("AccountNumber: " + accountNumber);
		System.out.println("Balance: " + balance);
		System.out.println("Account Holder Name: " + accountHolderName);
		System.out.println("Account Holder Address: " + accountHolderAddress);
	
	}
	
}


