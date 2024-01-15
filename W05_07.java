package tutorialworkshop05;

public class W05_07 {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		
		int result1 = calculator.twointaddition(5, 8);
		System.out.println("Additon of two int is: " + result1);
		
		int result2 = calculator.threeintaddition(10, 15, 20);
		System.out.println("Additon of three int is: " + result2);
		
		double result3 = calculator.twodoubleaddition(2.7, 3.5);
		System.out.println("Additon of two double is: " + result3);
		
		double result4 = calculator.threedoubleaddition(1.1, 2.2, 3.3);
		System.out.println("Additon of three double is: " + result4);

	}

}

class Calculator{
	int twointaddition(int a, int b) {
		return  a + b;
	}
	
	int threeintaddition(int a, int b, int c) {
		return a + b + c;
	}
	
	double twodoubleaddition(double a, double b) {
		return a + b;
	}
	
	double threedoubleaddition(double a, double b, double c) {
		return a + b + c;
	}
}


