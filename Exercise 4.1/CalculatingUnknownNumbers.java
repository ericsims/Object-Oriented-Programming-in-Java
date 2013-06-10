import java.util.Scanner;

public class CalculatingUnknownNumbers {
	public static void main(String[] args) {
		//Declare variables
		int sum = 0;
		int numOfPositive = 0;
		int numOfNegitive = 0;


		//Create a scanner for reading console
		Scanner input = new Scanner(System.in);

		//Ask for integers
		System.out.print("Please enter integer values, the program exits if the input is 0: ");
		while (true) {
			int num;

			//Exception handling for an invalid input integer. Original: "num = input.nextInt();"
			try {
				num = input.nextInt();
			} catch (Exception ex) {
				System.out.println("\"" + input.next() + "\" is an invalid integer!");
				continue;
			}

			if (num == 0)
				break;
			else if (num > 0)
				numOfPositive += 1;
			else if (num < 0)
				numOfNegitive += 1;

			sum += num;
		}

		//Calculate average
		float average = sum / (numOfPositive + numOfNegitive);

		//Print output
		System.out.println("The number of positives is " + numOfPositive);
		System.out.println("The number of negitives is " + numOfNegitive);
		System.out.println("The total is " + sum);
		System.out.println("The average is " + average);

	}
}