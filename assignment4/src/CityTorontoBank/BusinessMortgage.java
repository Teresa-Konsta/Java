package CityTorontoBank;

public class BusinessMortgage extends Mortgage {
	
	/*extends Mortgage. Its constructor sets the interest rate to 1% over the current prime rate.*/
	private double interestRate = 0.01;

	public BusinessMortgage(int mNum, String customer, double mAmount, int trm, double interest) {
		super(mNum, customer, mAmount, interest, trm);
		super.interestRate = this.interestRate;
	}
}