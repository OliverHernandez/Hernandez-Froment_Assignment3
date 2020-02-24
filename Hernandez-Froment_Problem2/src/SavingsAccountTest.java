
public class SavingsAccountTest 
{	
	public static void main(String[] args)
	{
		int month = 1;
		SavingsAccount saver1 = new SavingsAccount(2000.00);
		SavingsAccount saver2 = new SavingsAccount(3000.00);
		SavingsAccount.modifyInterestRate(0.04);
		
		
		for (int i = 0; i < 12; i++)
		{
			System.out.print("Month: " + month + " Interest Rate: " + saver1.calculateMonthlyInterest());
			System.out.println(" Balance: " + saver1.getSavingsBalance());
			month++;
		}
		
		System.out.println("----------------------------------------------------------------------");
		
		month = 1;
		for (int i = 0; i < 12; i++)
		{
			System.out.print("Month: " + month + " Interest Rate: " + saver2.calculateMonthlyInterest());
			System.out.println(" Balance: " + saver2.getSavingsBalance());
			month++;
		}

		SavingsAccount.modifyInterestRate(0.05);
		month = 13;
		System.out.println("----------------------------------------------------------------------");
		System.out.print("Month: " + month + " Interest Rate: " + saver1.calculateMonthlyInterest());
		System.out.println(" Balance: " + saver1.getSavingsBalance());
		System.out.println("----------------------------------------------------------------------");
		System.out.print("Month: " + month + " Interest Rate: " + saver2.calculateMonthlyInterest());
		System.out.println(" Balance: " + saver2.getSavingsBalance());
	}
}

