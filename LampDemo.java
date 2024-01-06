package tutorial_workshop04;
import java.util.*;

class Lampxa {
    boolean isOn;

    void turnOn() {
        isOn = true;
        System.out.println("Turned on");
    }

    void turnOff() {
        isOn = false;
        System.out.println("Turned off");
    }

    boolean isLampOn() {
        return isOn;
    }
}

public class LampDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter 1 to turn on the light and 0 to turn off the light: ");
        boolean choice = input.nextBoolean();

        Lampxa l = new Lampxa();

        if (choice == true) {
            l.turnOn();
        } else {
            l.turnOff();
        }
        input.close();
    }
}