package assignment4;

public class Life extends Insurance {
	public Life()
	{
		super();
	}
	
	@Override
	public void setInsuranceCost(double mCost)
	{
		this.monthlyCost = mCost;
		
	}
	
	@Override
	public void displayInfo()
	{
		System.out.println("Insurance type: " + this.insuranceType);
		System.out.println("Monthly fee: " + this.monthlyCost);
	}
}
