import java.util.Scanner;

public class EvenNum {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number: ");
		int userNumber = scan.nextInt();
		
		determineEven(userNumber);
		returnNum(userNumber);
	}
	
	public static void determineEven(int number) {
		if ((number % 2) == 0)
			System.out.println("Number is even");
		else
			System.out.println("Number is odd");
	}
	
	public static void returnNum(int number) {
		if (number >= 90 && number <= 100)
			System.out.println("4");
		else if (number >= 80 && number <= 89)
			System.out.println("3");
		else if (number >= 70 && number <= 79)
			System.out.println("2");
		else if (number >= 60 && number <= 69)
			System.out.println("1");
		else
			System.out.println("0");
	}
}