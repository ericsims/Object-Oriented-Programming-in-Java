import java.util.Scanner;

public class GreatestCommonDivisor {
	public static void main(String[] args) {
		//Declare variables
		int int1, int2;
		int result = 1;
		int factor = 1;

		//Create a scanner for reading console
		Scanner input = new Scanner(System.in);

		//Ask for and read integers
		System.out.print("Enter two integers: ");
		int1 = input.nextInt();
		int2 = input.nextInt();

		//Switch integers if needed
		if (int2 > int1) {
			int temp = int1;
			int1 = int2;
			int2 = temp;
		}
		
		//Find greatest common factor
		factor = int2;
		while (result != 0) {
			
			result = int1 % factor;
			
			if (result != 0) {
				int factorResult = 1;
				while (factorResult != 0) {
					factor--;
					factorResult = int2 % factor;
				}
				
			}
			
		}

		//Print output
		System.out.println(factor);

	}
}