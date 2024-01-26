package tutorialworkshop09; 
import java.util.*;

public class Qn5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> rollNum = new ArrayList<>();

        rollNum.add(3);
        rollNum.add(4);
        rollNum.add(5);
        rollNum.add(6);
        rollNum.add(7);
        rollNum.add(8);
        rollNum.add(9);

        // Shuffling the elements
        shuffle(rollNum);

        // Display the shuffled ArrayList
        System.out.println("Shuffled ArrayList: " + rollNum);
    }

    public static void shuffle(ArrayList<Integer> rollNum) {
        Collections.shuffle(rollNum);
    }
}
