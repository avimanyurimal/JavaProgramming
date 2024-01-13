package tutorialworkshop05;

public class W05_02 {

	public static void main(String[] args) {
		Circle circle = new Circle(5);
		System.out.println("Perimeter of Circle is : " + circle.getPerimeter());
		System.out.println("Area of Circle is : " + circle.getArea());

	}

}

class Shape {
	double getPerimeter() {
		System.out.println("perimeter of circle:");
		return 0;
	}
	double getArea() {
		System.out.println("Area of circle:");
		return 0;
	}
	
}

class Circle extends Shape{
	double radius;
	
	
	public Circle(double radius) {
		this.radius= radius;
	}
	
	@Override
	double getPerimeter() {
		double perimeter = 2 * Math.PI * radius;
		return perimeter;
	}
	
	@Override
	double getArea() {
		double area = Math.PI * radius *radius;
		return area;
	}
	
}