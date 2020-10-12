package rectangle;
import java.util.Scanner;

public class Rectangle {
		private float length = 1;
		private float width = 1;
		
		public Rectangle(float length, float width) {
			      this.length = length;
			      this.width = width;
		}
				
		public float getLength() {			    
			return length;
		   }
		
		public void setLength(float length) {
			if (length < 0.0 && length > 20.0)                   
		         throw new IllegalArgumentException(
		            "Length must be >= 0.0 and <= 20.0");
			this.length = length;
		}
		
		public float getWidth() {
			return width;
		   }
		
		public void setWidth(float width) {
			if (width < 0.0 && width > 20.0)                   
		         throw new IllegalArgumentException(
		            "Width must be >= 0.0 and <= 20.0");
			this.width = width;
		}
				
		 public float calculatePerimeter(float length, float width){
			 float perimeter = (2 * (length + width));
	         return perimeter;
	     }
		
		public float calculateArea(float length, float width) {
			float area = (getLength() * getWidth());
			return area;
		}
	
	 public static void main(String[] args){
		 Scanner scan = new Scanner(System.in);
			System.out.println("Enter the length: ");
			float length = scan.nextFloat();
			System.out.println("Enter the width: ");
			float width = scan.nextFloat();
			
         Rectangle rectangle = new Rectangle(length, width);
         
         System.out.printf("The perimeter of rectangle is: %.2f\n", rectangle.calculatePerimeter(length, width));
         System.out.printf("The area of rectangle is: %.2f", rectangle.calculateArea(length, width));
  }
}