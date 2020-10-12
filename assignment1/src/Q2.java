import java.util.Scanner;

public class Q2 {
	
public static void main (String[] args) {
	
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Enter temperature in Farenheit: ");
	double tFarenheit = scan.nextDouble();
	
	//T(°C) = (T(°F) - 32) × 5/9
	//T(°C) = (T(°F) - 32) / 9/5
	//T(°C) = (T(°F) - 32) / 1.8
	double tCelsius = ((tFarenheit - 32) / 1.8);
	System.out.println("Temperature in Celsius is: " + tCelsius);
	}
}
