package tutorial_workshop04;
import java.util.Scanner;
public class W04_03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the amount you want to deposite: ");
		int deposite = scanner.nextInt();
		
		System.out.println("Enter the amount you want to withdraw: ");
		int withdraw = scanner.nextInt();
		
		scanner.close();
		
		depositeMoney s1 = new depositeMoney();
		s1.accountNumber = 1782928;
		s1.balance = 50000;
		s1.accountHolderName ="Maya";
		s1.accountHolderAddress ="Kathmandu";
		s1.depositemoney(deposite);
		s1.withdrawMoney(withdraw);
		s1.detailsforbankaccount();
	}

}
class depositeMoney{
	int accountNumber;
	int balance;
	String accountHolderName;
	String accountHolderAddress;
	void detailsforbankaccount() {
		System.out.println("Account Number: " + accountNumber);
		System.out.println("Balance: " + balance);
		System.out.println("Account Holder Name: " + accountHolderName);
		System.out.println("Account Holder Address: " + accountHolderAddress);
	}
	void depositemoney (int d) {
		balance+=d;
	}
	void withdrawMoney (int w) {
		balance-=w;
	}
}

