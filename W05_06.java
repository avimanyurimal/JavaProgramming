package tutorialworkshop05;

public class W05_06 {

	public static void main(String[] args) {
		LastClass s1 = new LastClass();
		s1.methods();
	}

}

class FinalClass{
	void methods() {
		System.out.println("this is method in main clas acc to quest");
	
}

}

class LastClass extends FinalClass{
	
	@Override
	void methods(){
		System.out.println("this is to override in class methiods for trying dingg dingg");
		
	}
}