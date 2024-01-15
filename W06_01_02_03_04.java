package tutorialworkshop_06;

public class W06_01_02_03_04 {

	public static void main(String[] args) {
		Quadrilateral q = new Quadrilateral();
		q.calculateArea();
		q.calculatePerimeter();
	}

}

abstract class Shape{
	abstract void calculateArea();
	
	abstract void calculatePerimeter();
}

class Quadrilateral extends Shape{
	void calculateArea() {
		System.out.println("This is area calculate from Shape class");
	}
	void calculatePerimeter() {
		System.out.println("This is perimeter calcutale form Shape class");
	}
}
