import java.util.Scanner;

public class ReverseNum {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number: ");
		int number = scan.nextInt();
		int reverseNumber = 0;
		
		while(number != 0)
	    {
			reverseNumber =  ((reverseNumber * 10) + (number % 10));
	        number = number/10;
	    }

	    System.out.println("Reverse number is: " + reverseNumber);
	}
}