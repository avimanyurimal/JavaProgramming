package tutorial_workshop04;

public class T04_17 {

	public static void main(String[] args) {
		User s1 = new User();
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
class User {
	public String username;
	public String password;
	public String email;
	
	public void setUsername(String u) {
		this.username = u;
	}
	public String getUsername() {
		return username;
	}
	
	public void setPassword(String p) {
		this.password = p;
	}
	public String getPassword() {
		return password;
	}
	
	public void setEmail(String e) {
		this.email = e;
	}
	public String getEmail() {
		return email;
	}
	
}
	
	


