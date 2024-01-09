package tutorial_workshop04;

public class W04_01_02 {

	public static void main(String[] args) {
		BankAccountt s1 = new BankAccountt();
		s1.accountNumber =16810007;
		s1.balance =45000;
		s1.accountHolderName ="Maya";
		s1.accountHolderAddress ="kathmandu";
		s1.detailsofbankAccount();	
	}
}

class BankAccountt{
	int accountNumber;
	int balance;
	String accountHolderName;
	String accountHolderAddress;
	void detailsofbankAccount() {
		System.out.println("Account Number: " + accountNumber);
		System.out.println("Balance In Account: " + balance);
		System.out.println("Account Holder Name: " + accountHolderName);
		System.out.println("Account Holder Address: " + accountHolderAddress);	
		
	}
	
}