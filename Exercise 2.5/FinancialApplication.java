import java.util.Scanner;

public class FinancialApplication {
	
	public static void main(String[] args) {

		//Create a scanner for reading console
		Scanner input = new Scanner(System.in);

		//Ask for and read subtotal
		System.out.print("Enter the subtotal price: ");
		double subtotalPrice = input.nextDouble();

		//Ask for and read gratuity rate
		System.out.print("Enter the gratuity rate: ");
		double gratuityRate = input.nextDouble();

		//Calculate the total cost
		double gratuityPrice = (gratuityRate / 100) * subtotalPrice;
		double totalPrice  = subtotalPrice + gratuityPrice;

		//Print output
		System.out.print("The gratuity is: $" + gratuityPrice + " and the total is: $" + totalPrice);
	}
}
