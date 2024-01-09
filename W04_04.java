package tutorial_workshop04;
import java.util.Scanner;
public class W04_04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter true for on light and false to off light: ");
		boolean choose = scanner.nextBoolean();
		
		Lamp l = new Lamp();
		
		if ( choose == true) {
			l.turnon();
		}else {
			l.turnoff();
		}
		
		scanner.close();

	}

}

class Lamp {
	boolean ison;
	void turnon() {
//		ison = true;
		System.out.println("The Light is on");
	}
	boolean isoff;
	void turnoff() {
//		isoff = false;
		System.out.println("The Light is off");
	}
	
}