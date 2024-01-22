package tutorialworkshop_06;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class W06_16 {

	public static void main(String[] args) {
		String check = "[a-zA-Z0-9]+";
		Pattern p = Pattern.compile(check);
		
		String userInput = "Hello76";
		Matcher m = p.matcher(userInput);
		
		boolean result = m.matches();
		System.out.println(result);
	}
}

