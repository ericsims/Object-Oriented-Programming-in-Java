import java.util.Date;

public class Account {
	private int id = 0;
	private double balance = 0.0;
	private double annualInterestRate = 0;
	private Date dateCreated;

	Account() {
		id = 0;
		balance = 0.0;
		annualInterestRate = 0;
		
		Date date = new Date();
		dateCreated = new Date(date.getTime());
	}
	
	Account(int accountID, double initialBalance) {
		id = accountID;
		balance = initialBalance;
		
		Date date = new Date();
		dateCreated = new Date(date.getTime());
	}
	
	public void withdraw(double withdraw) {
		balance -= withdraw;
	}
	
	public void deposit(double deposit) {
		balance -= deposit;
	}
	
	
	public int getID() {
		return id;
	}
	
	public void setID (int newID) {
		id = newID;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double newBalance) {
		balance = newBalance;
	}
	
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	
	public void setAnnualInterestRate(double newAnnualInterestRate) {
		annualInterestRate = newAnnualInterestRate;
	}
	
	public double getMonthlyInterestRate() {
		return annualInterestRate / 12;
	}
	
	public Date getDateCreated() {
		return dateCreated;
	}
}
