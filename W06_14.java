package tutorialworkshop_06;

public class W06_14 {

	public static void main(String[] args) {
		try {
			System.out.println(10/0);
		} catch (Exception e){
			System.out.println("Error: "+e);
		}
	}
}

