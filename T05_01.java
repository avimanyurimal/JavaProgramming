package tutorialworkshop05;

public class T05_01 {

	public static void main(String[] args) {
		Bank s1 = new hello();
		Bank s2= new bye();
		s1.Deposite();
		s2.Deposite();
		
	}

}

abstract class Bank {
	void Deposite() {
		System.out.println("This is the methods");
	}

}

class hello extends Bank{
	void Deposite() {
		super.Deposite();
		System.out.println("this is child class");
	}
}

class bye extends Bank{
	void Deposite() {
		System.out.println("this is subclass");
	}
}
