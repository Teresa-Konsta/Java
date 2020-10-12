import java.util.Scanner;

public class Q1 {
	
public static void main (String[] args) {
	
	Scanner input = new Scanner(System.in);
	int sum = 1;
	
	for(int i = 0; i < 3; i++) {		
		System.out.println("Enter integer: ");
		int number = input.nextInt();
		sum *= number;
		}
	input.close();
	System.out.println("Product: " + sum);
	}
}
