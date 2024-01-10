package tutorial_workshop04;

public class W04_07 {

	public static void main(String[] args) {
		Box for_square = new Box(5);
		Box rectangle = new Box(4, 6, 8);
		Box defaultBox = new Box();
		System.out.println("Square box: " + " width= " + for_square.width + " Height= " + for_square.height + " Depth= " + for_square.depth);
		System.out.println("Square box: " + " width= " + rectangle.width + " Height= " + rectangle.height + " Depth= " + rectangle.depth);
		System.out.println("Default Box Dimensions: " + "Width=" + defaultBox.width + ", Height=" + defaultBox.height + ", Depth=" + defaultBox.depth);
	}

}

class Box {
	double width;
	double height;
	double depth;
	
	
	public Box(double length) {
		this.width = length;
		this.height = length;
		this.depth = length;
	}
	
	public Box(double length, double breadth, double height) {
		this.width = length;
		this.height = height;
		this.depth = width;
	}
	
	public Box() {
		this.width = 10;
		this.depth = 8;
		this.height = 12;
		
	}
}