
public class TestAccount {
	public static void main(String[] args) {
		Account account = new Account(1122, 20000.00);
		account.setAnnualInterestRate(4.5);

		account.withdraw(2500.00);
		account.deposit(3000);

		System.out.println("The account created on " 
				+ account.getDateCreated().toString() + " has a balance of " 
				+ account.getBalance() + " and a monthly intrest rate of " 
				+ account.getMonthlyInterestRate() + "%.");
	}
}
