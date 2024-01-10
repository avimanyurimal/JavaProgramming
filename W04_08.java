package tutorial_workshop04;

public class W04_08 {

	public static void main(String[] args) {
		Bankaccount s1 = new Bankaccount();
		s1.setBalance(45000);
		int balance = s1.getBalance();
		System.out.println("Balance is: " + balance);

	}

}

class Bankaccount{
	private int balance;
	
	public void setBalance(int b) {
		this.balance = b;
	}
	public int getBalance() {
		return balance;
	}
}