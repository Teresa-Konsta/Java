package CityTorontoBank;

public abstract class Mortgage implements IMortgageConstants {
	private int mortgageNum;
	private String customerName;
	private double mortgageAmount;
	protected double interestRate;
	private int term;
	
	public Mortgage(int mNum, String customer, double mAmount, double interest, int trm)
	{
		this.mortgageNum = mNum;
		this.customerName = customer;
		this.mortgageAmount = mAmount;
		this.interestRate = interest;
		this.term = trm;
	}

	public void getMortgageInfo(int mNum, String customer, double mAmount, double interest, int trm)
	{
		System.out.println("mortgage number: " + this.mortgageNum);
		System.out.println("customer name: " + this.customerName);
		System.out.println("amount of mortgage: " + this.mortgageAmount);
		if(mAmount > MAX_MORTGAGE)
			throw new IllegalArgumentException("Maximum mortgage amount is $" + MAX_MORTGAGE);
		System.out.println("interest rate: " + this.interestRate);
		System.out.println("term: " + this.term);
			
		if(trm != SHORT_TERM_MORTGAGE || trm != MEDIUM_TERM_MORTGAGE || trm != LONG_TERM_MORTGAGE)
			trm = SHORT_TERM_MORTGAGE;
		this.term = SHORT_TERM_MORTGAGE;
	}
}