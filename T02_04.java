package tutorialworkshop_02;

public class T02_04 {

	public static void main(String[] args) {
		boolean expr1_and = (5 > 3);
		boolean expr2_and = (8 > 5);
		boolean expr1_or = (5 > 3);
		boolean expr2_or = (2 > 5);
		boolean expr1_not = (!(5 == 10));
		
		if(expr1_and && expr2_and) {
			System.out.println("The result is Logical AND");
		}else if(expr1_or || expr2_or) {
			System.out.println("The result is Logical OR");
		}else if(expr1_not) {
			System.out.println("The result is Logical NOT");
		}

	}

}
