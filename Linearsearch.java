package tutorialworkshop_03;

import java.util.Scanner;

public class Linearsearch {
public static void main(String[] args) {

int []age = {34, 45, 67, 89, 34};
Scanner input = new Scanner(System.in);
System.out.print("Enter value of array: ");
int n = input.nextInt();
for (int i=0;i<age.length;i++) {
if(age[i]==n) {

System.out.println("Element found at " + i +" index");
break;
}else {
System.out.println("Element not found at " + i + " index");
}
System.out.println
(age[i]);
}
input.close();
}
}