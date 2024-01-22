package tutorialworkshop_06;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class W06_17 {

	public static void main(String[] args) {
		String check = "[A-Z][a-z]+";
		Pattern p = Pattern.compile(check);
		
		String UserInput = "hello how are";
		Matcher m = p.matcher(UserInput);
		
		boolean b = m.matches();
		System.out.println(b);
		while (m.find()) {
			System.out.println(m.group());
		}
	}
}
