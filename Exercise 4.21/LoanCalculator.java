import java.util.Scanner;

public class LoanCalculator {
	public static void main(String[] args) {

		//Create a scanner for reading console
		Scanner input = new Scanner(System.in);

		//Ask for and read loan amount and number of years
		System.out.print("Loan Amount: ");
		double loanAmount = input.nextDouble();
		System.out.print("Number of Years: ");
		int months = input.nextInt() * 12;

		//Calculate and print output
		System.out.println();
		System.out.println("Intrest Rate \t Monthly Payment \t Total Payment");
		double intrestRate = 5.00;
		while (intrestRate <= 8.00){
			double monthlyIntrestRate = intrestRate / 100 / 12;
			double monthlyPayment = loanAmount * ( monthlyIntrestRate / ( 1 - Math.pow(1 + monthlyIntrestRate, 0 - months)));
			double totalPayment = monthlyPayment * months;
			
			System.out.println(intrestRate + "\t" + monthlyPayment + "\t" + totalPayment);
			intrestRate += 0.25;
		}
		
	}
}