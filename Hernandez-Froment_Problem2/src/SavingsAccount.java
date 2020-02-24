
public class SavingsAccount 
{
	//Two variables to hold the balance of the account
	//and the year's interest.
	private double savingsBalance;
	private static double annualInterestRate;
	
	SavingsAccount(double balance)
	{
		this.savingsBalance = balance;
	}
	
	public double calculateMonthlyInterest()
	{
		//Instance variable to hold the monthly interest rate.
		double monthlyInterest;
		//Calculate the monthly interest rate
		monthlyInterest = ((savingsBalance * annualInterestRate) / 12);
		savingsBalance += monthlyInterest;
		return monthlyInterest;
	}
	
	public static void modifyInterestRate(double interestRate)
	{
		//set the annual interest rate equal to the new value.
		annualInterestRate = interestRate;
	}
	
	public double getSavingsBalance()
	{
		return this.savingsBalance;
	}
}
