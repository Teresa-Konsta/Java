package assignment4;
import java.util.Scanner;

public class Driver {
	public static void main(String[] args){
		Insurance[] arrayInsurance = new Insurance[6];
		
		 Scanner scan = new Scanner(System.in);
		 
			System.out.println("Enter insurance type: ");
			String insurance = scan.next();
			System.out.println("Enter monthly fee: ");
			double mFee = scan.nextDouble();
			
			if(insurance == "health")
			{
				Health healthinsr = new Health();
				healthinsr.setInsuranceCost(mFee);
				healthinsr.displayInfo();
			}
			else if(insurance == "life")
			{
				Life lifeinsr = new Life();
				lifeinsr.setInsuranceCost(mFee);
				lifeinsr.displayInfo();
			}
			
			for(int i = 0; i < arrayInsurance.length; i++)
			{
				arrayInsurance[i].setInsuranceCost(mFee);
				System.out.println(arrayInsurance[i]);
			}
	}
}