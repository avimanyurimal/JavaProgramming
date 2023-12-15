package tutorialworkshop_03;
import java.util.Arrays;
public class W03_07 {

	public static void main(String[] args) {
		String[] array = {"apple","ball","cat","dog","egg","fish"};
		String targetElement = "cat";
		int index = Arrays.asList(array).indexOf(targetElement);
		
		if (index != -1) {
			System.out.println("Element " + targetElement + " Found at index " + index);
		} else {
			System.out.println("Element " + targetElement + " not Found in th array.");
		}

	}
}
