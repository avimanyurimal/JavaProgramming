package tutorial_workshop04;


class Studentss {
	private String name;
	private int age;
	
	void setName(String n) {
		this.name = n;
	}
	String getName() {
		return name;
	}
	
	void setAge(int a) {
		this.age = a;
	}
	int getAge() {
		return age;
	}
}
public class Encaplusion {

	public static void main(String[] args) {
		Studentss s1 = new Studentss();
		s1.setName("Avimanyu");
		String stu = s1.getName();
		System.out.println("Hello iam " + stu);
		Studentss s2 = new Studentss();
		s2.setAge (21);
		int age = s2.getAge();
		System.out.println("Hello iam " + age);
		
		
	}

}

