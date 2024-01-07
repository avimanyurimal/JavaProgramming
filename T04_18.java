package tutorial_workshop04;

public class T04_18 {

	public static void main(String[] args) {
		Carssss s1 = new Carssss();
		s1.setModel(3);
		s1.setCompany("Tesla");
		
		int model = s1.getModel();
		String company = s1.getCompany();
		
		System.out.println("Model of car is: " + model);
		System.out.println("Company of car is: " + company);
	}

}
class Carssss{
	private int model;
	private String company;
	
	public void setModel(int m) {
		this.model = m;
	}
	public int getModel() {
		return model;
	}
	
	public void setCompany(String c) {
		this.company = c;
	}
	public String getCompany() {
		return company;
	}
		
}