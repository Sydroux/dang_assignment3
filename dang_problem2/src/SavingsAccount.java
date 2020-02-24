
public class SavingsAccount {
	private static double annualInterestRate;
	
	private double savingsBalance;
	
	public void calculateMonthlyInterest() {
		savingsBalance = savingsBalance + ((savingsBalance * annualInterestRate) / 12);
	}
	
	public static void modifyInterestRate(int newInterestRate) {
		annualInterestRate = newInterestRate;
	}

	public static double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public static void setAnnualInterestRate(double annualInterestRate) {
		SavingsAccount.annualInterestRate = annualInterestRate;
	}

	public double getSavingsBalance() {
		return savingsBalance;
	}

	public void setSavingsBalance(double savingsBalance) {
		this.savingsBalance = savingsBalance;
	}
}
