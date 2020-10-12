package CityTorontoBank;
import java.util.Scanner;

public class ProcessMortgage {	
	public static void main(String[] args){
		 Scanner scan = new Scanner(System.in);
		 
			
		Mortgage[] arrayMrtg = new Mortgage[2];
		
		int i = 0;
		int stop = 3;
		while (stop < 3) {
			System.out.print("Please enter current interest rate: ");
		     double interestR = scan.nextDouble();
			System.out.print("Please enter mortgage number: ");
			int mortgageNumber = scan.nextInt();
			System.out.print("Please enter customer name: ");
			String customerName = scan.next();
			System.out.print("Please enter mortgage amount: ");
			double amountMortgage = scan.nextDouble();
			System.out.print("Please enter term: ");
			int term = scan.nextInt();

			PersonalMortgage personalMortgage = new PersonalMortgage(mortgageNumber, customerName, amountMortgage, interestR,
						term);
			arrayMrtg[i] = personalMortgage;
			i++;
			}
		}
			
		System.out.println(arrayMrtg[i]);
	}
}