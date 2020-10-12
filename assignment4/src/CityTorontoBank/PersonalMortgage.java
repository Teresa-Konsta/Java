package CityTorontoBank;

public class PersonalMortgage extends Mortgage {
	
	/*extends Mortgage. Its constructor sets the interest rate to 2% over the current prime rate.*/

	private double interestRate = 0.02;
	
	public PersonalMortgage(int mNum, String customer, double mAmount, int trm, double interest) {
		super(mNum, customer, mAmount, interest, trm);
		super.interestRate = this.interestRate;
	}
}