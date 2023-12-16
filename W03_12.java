package tutorialworkshop_03;

public class W03_12 {

	public static void main(String[] args) {
		String[] strings = { "Hello", " ", "World", "!" };
        StringBuilder result = new StringBuilder();

        for (String str : strings) {
            result.append(str);
        }

        System.out.println("Concatenated string: " + result.toString());
    }

}

