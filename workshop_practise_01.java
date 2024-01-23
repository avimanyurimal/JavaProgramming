package tutorialworkshop_06;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class workshop_practise_01 {

	public static void main(String[] args) {
		
		
		//String regex = "\\w"; 
		//\\w for to take one single word character value a-z A-Z or 0-9 or _
		// \\w+ for multiple value 
		// \\w for all a-z, A - z, 0-9 or _
		// \\w? for 0 and 1
		// \\w* for 0 and more than 0
		// \\d for 0-9 digit
		// \\W for  all work except work of small w
		// \\D for all work than small d
		// \\s for  blank white space
		
		String regex = "[a-zzz0-9.]+[@][a-z]{5}+[.]+[a-z]{3}"; 
		
		Pattern p = Pattern.compile(regex);
		
		String userInput = "rimal.avimanyu@gmail.com";
		Matcher m = p.matcher(userInput);
		
		boolean result = m.matches();
		System.out.println(result);

	}

}

