package tutorialworkshop_06;

public class W06_18 {

	public static void main(String[] args) {
		String fileName = "oee.txt";
		
		boolean isfilecorrect = fileName.endsWith(".txt");
		
		if (isfilecorrect) {
			System.out.println("The file "+fileName + " represent a .txt file.");
		} else {
			System.out.println("The file "+fileName+" doesn't ends with .txt file.");
		}
	}
}

