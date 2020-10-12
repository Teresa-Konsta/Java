package assignment4;

abstract public class Insurance {
	
	protected String insuranceType;
	protected double monthlyCost;

	public Insurance() {
		this.insuranceType = "";
		this.monthlyCost = 0;
	}
	
	public String getInsuranceType()
	{
		return this.insuranceType;
	}
	
	public double getInsuranceCost()
	{
		return this.monthlyCost;
	}
	
	public abstract void setInsuranceCost(double mCost);
	public abstract void displayInfo();
}