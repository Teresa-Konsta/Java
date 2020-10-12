package rectangle;

public class Square extends RectangleNew {
	private float s;
	
	public Square (float site) {
		super(site, site);
		this.s = site;
	}
	
	public void printPerimeter(float side) {
		float perimeter = (side * 4);
		System.out.printf("Perimeter of a square is: %.2f\n", + perimeter);
	}
	
	public void printArea(float side) {
		float square = (side * side);
		System.out.printf("Area of a square is: %.2f\n", + square);
	}
}
