 package tutorial_workshop04;
public class T04_16_encapsulation {
	public static void main(String[] args) {
		user s1 = new user();
		s1.setUsername("Avimanyu");
		s1.setPassword("ss123425");
		s1.setEmail("sdvsdsh@gmail.com");
		
		String username = s1.getUsername();
		String password = s1.getPassword();
		String email = s1.getEmail();
		
		System.out.println("username is: " + username);
		System.out.println("password is: " + password);
		System.out.println("email is: " + email);
	}
}
class user {
	private String username;
	private String password;
	private String email;
	
	void setUsername(String u) {
		this.username = u;
	}
	String getUsername() {
		return username;
	}
	
	void setPassword(String p) {
		this.password = p;
	}
	String getPassword() {
		return password;
	}
	
	void setEmail(String e) {
		this.email = e;
	}
	String getEmail() {
		return email;
	}
	
}
	
