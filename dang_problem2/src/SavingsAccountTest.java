
public class SavingsAccountTest extends SavingsAccount{

	public static void main(String[] args) {
		SavingsAccount saver1 = new SavingsAccount();
		SavingsAccount saver2 = new SavingsAccount();
		
		saver1.setSavingsBalance(2000);
		saver2.setSavingsBalance(3000);
		
		SavingsAccount.setAnnualInterestRate(0.04);
			
		System.out.printf("%-5s%7s%9s%9s%9s%9s%9s%9s%9s%9s%9s%9s%n", "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec");
		
		saver1.calculateMonthlyInterest();
		System.out.printf("%-5.2f", saver1.getSavingsBalance());
		saver1.calculateMonthlyInterest();
		System.out.printf("%2s%.2f", " ", saver1.getSavingsBalance());
		saver1.calculateMonthlyInterest();
		System.out.printf("%2s%.2f", " ", saver1.getSavingsBalance());
		saver1.calculateMonthlyInterest();
		System.out.printf("%2s%.2f", " ", saver1.getSavingsBalance());
		saver1.calculateMonthlyInterest();
		System.out.printf("%2s%.2f", " ", saver1.getSavingsBalance());
		saver1.calculateMonthlyInterest();
		System.out.printf("%2s%.2f", " ", saver1.getSavingsBalance());
		saver1.calculateMonthlyInterest();
		System.out.printf("%2s%.2f", " ", saver1.getSavingsBalance());
		saver1.calculateMonthlyInterest();
		System.out.printf("%2s%.2f", " ", saver1.getSavingsBalance());
		saver1.calculateMonthlyInterest();
		System.out.printf("%2s%.2f", " ", saver1.getSavingsBalance());
		saver1.calculateMonthlyInterest();
		System.out.printf("%2s%.2f", " ", saver1.getSavingsBalance());
		saver1.calculateMonthlyInterest();
		System.out.printf("%2s%.2f", " ", saver1.getSavingsBalance());
		saver1.calculateMonthlyInterest();
		System.out.printf("%2s%.2f%n", " ", saver1.getSavingsBalance());
		
		saver2.calculateMonthlyInterest();
		System.out.printf("%-5.2f", saver2.getSavingsBalance());
		saver2.calculateMonthlyInterest();
		System.out.printf("%2s%.2f", " ", saver2.getSavingsBalance());
		saver2.calculateMonthlyInterest();
		System.out.printf("%2s%.2f", " ", saver2.getSavingsBalance());
		saver2.calculateMonthlyInterest();
		System.out.printf("%2s%.2f", " ", saver2.getSavingsBalance());
		saver2.calculateMonthlyInterest();
		System.out.printf("%2s%.2f", " ", saver2.getSavingsBalance());
		saver2.calculateMonthlyInterest();
		System.out.printf("%2s%.2f", " ", saver2.getSavingsBalance());
		saver2.calculateMonthlyInterest();
		System.out.printf("%2s%.2f", " ", saver2.getSavingsBalance());
		saver2.calculateMonthlyInterest();
		System.out.printf("%2s%.2f", " ", saver2.getSavingsBalance());
		saver2.calculateMonthlyInterest();
		System.out.printf("%2s%.2f", " ", saver2.getSavingsBalance());
		saver2.calculateMonthlyInterest();
		System.out.printf("%2s%.2f", " ", saver2.getSavingsBalance());
		saver2.calculateMonthlyInterest();
		System.out.printf("%2s%.2f", " ", saver2.getSavingsBalance());
		saver2.calculateMonthlyInterest();
		System.out.printf("%2s%.2f%n", " ", saver2.getSavingsBalance());
		
		SavingsAccount.setAnnualInterestRate(0.05);
		
		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();
		
		System.out.println("");
		System.out.printf("%.2f%n", saver1.getSavingsBalance());
		System.out.printf("%.2f%n", saver2.getSavingsBalance());
		
	}

}
