package tutorialworkshop_03;

public class W03_09 {

    public static void main(String[] args) {
        char[] characters = {'a', 'u', 'c', 'e', 'o', 'd', 'f'};
        int vowelCount = 0;

        for (char ch : characters) {
            // Convert the character to lowercase for comparison
            char lowercaseCh = Character.toLowerCase(ch);
            
            // Check if the character is a vowel
            if (lowercaseCh == 'a' || lowercaseCh == 'e' || lowercaseCh == 'i' || lowercaseCh == 'o' || lowercaseCh == 'u') {
                vowelCount++;
            }
        }

        System.out.println("Number of vowels: " + vowelCount);
    }
}