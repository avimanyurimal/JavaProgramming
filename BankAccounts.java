package tutorial_workshop04;
import java.util.Scanner;
public class BankAccounts {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the amount for deposite: ");
		double deposite = input.nextDouble();
		
		System.out.println("Enter the amount of withdraw ");
		double withdraw = input.nextDouble();
	
		despositeMoney s1 = new despositeMoney();
		s1.accountNumber =7874784;
		s1.balance=25000;
		s1.accountHolderName="Maya";
		s1.accountHolderAddress="kathmandu";
		s1.depositMoney(deposite);
		s1.withdrawMoney(withdraw);
		s1.details();
		input.close();
	}
	
}
class despositeMoney{
	int accountNumber;
	double balance;
	String accountHolderName;
	String accountHolderAddress;
	void details () {
		System.out.println("AccountNumber: " + accountNumber);
		System.out.println("Balance: " + balance);
		System.out.println("Account Holder Name: " + accountHolderName);
		System.out.println("Account Holder Address: " + accountHolderAddress);
	}
	void withdrawMoney(double b) {
		balance-=b;
	}
	void depositMoney(double b) {
		balance+=b;
	
	
	}
}
