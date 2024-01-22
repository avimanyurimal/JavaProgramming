package tutorialworkshop_06;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class W06_19 {

	public static void main(String[] args) {
		String check = "mahudonhodon_123";
		Pattern p = Pattern.compile("^[a-zA-Z][A-Za-z0-9_]{2,15}$");
		
		Matcher m = p.matcher(check);
		boolean b = m.matches();
		
		System.out.println(b);	
	}
}

