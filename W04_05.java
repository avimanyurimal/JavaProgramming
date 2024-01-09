package tutorial_workshop04;

public class W04_05 {

	public static void main(String[] args) {
		BankAccounttt s1 = new BankAccounttt(6272772, 50000, "Maya", "Kathmandu");
		s1.detailsofbankaccount();
	}

}

class BankAccounttt {
	int accountNumber;
	int balance;
	String accountHolderName;
	String accountHolderAddress;
	
	public BankAccounttt(int accountNumber, int balance, String accountHolderName, String accountHolderAddress) {
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.accountHolderName = accountHolderName;
		this.accountHolderAddress = accountHolderAddress;
	}
	void detailsofbankaccount() {
		System.out.println("Account Number: " + accountNumber);
		System.out.println("Balance: " + balance);
		System.out.println("Account Holder Name: " + accountHolderName);
		System.out.println("Account Holder Address: " + accountHolderAddress);
		
	}
	
}