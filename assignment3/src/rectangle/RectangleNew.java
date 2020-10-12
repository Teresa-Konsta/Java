package rectangle;
import java.util.Scanner;

public class RectangleNew {
	private float length;
	private float width;
	
	public RectangleNew(float length, float width) {
		      this.length = length;
		      this.width = width;
	}
	
	public void printPerimeter(float length, float width) {
		float perimeter = ((length + width) * 2);
		System.out.printf("Perimeter of a rectangle is: %.2f\n", + perimeter);
	}
	
	public void printArea(float length, float width) {
		float area = (length * width);
		System.out.printf("Area of a rectangle is: %.2f\n", + area);
	}
	
	public static void main(String[] args){
		 Scanner scan = new Scanner(System.in);
		 
			System.out.println("Enter rectangle length: ");
			float length = scan.nextFloat();
			System.out.println("Enter rectangle width: ");
			float width = scan.nextFloat();
			
        RectangleNew rectangleNew = new RectangleNew(length, width);
        rectangleNew.printPerimeter(length, width);
        rectangleNew.printArea(length, width);
        
        System.out.println("\nEnter square side: ");
        float side = scan.nextFloat();
        
        Square square = new Square(side);
        square.printPerimeter(side);
        square.printArea(side);
 }
}