package tutorial_workshop04;

public class T04_07 {

	public static void main(String[] args) {
		College s1 = new College (12334, "Herald", "Naxal");
		s1.collegedetails();
		

	}

}

class College {
	int Regnum;
	String collegename;
	String Address;
	
	public College (int Regnum, String collegename, String Address) {
		this.Regnum = Regnum;
		this.collegename = collegename;
		this.Address = Address;
		
	}

	void collegedetails() {
		System.out.println("College Registration Number: " + Regnum);
		System.out.println("College Name: " + collegename);
		System.out.println("Address: " + Address);
	}
}
