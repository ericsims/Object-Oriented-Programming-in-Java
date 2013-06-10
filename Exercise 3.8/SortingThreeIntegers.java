import java.util.Scanner;

public class SortingThreeIntegers {
	public static void main(String[] args) {

		//Create a scanner for reading console
		Scanner input = new Scanner(System.in);

		//Ask for and read integers
		System.out.print("Please enter three integers: ");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();

		//Sort and print output
		if (num1 <= num2 && num1 <= num3) {
			System.out.print(num1 + " <= ");
			if (num2 <= num3)
				System.out.println(num2 + " <= " + num3);
			else
				System.out.println(num3 + " <= " + num2);
		}
		if (num2 <= num1 && num2 <= num3) {
			System.out.print(num2 + " <= ");
			if (num1 <= num3)
				System.out.println(num1 + " <= " + num3);
			else
				System.out.println(num3 + " <= " + num1);
		}
		if (num3 <= num2 && num3 <= num1) {
			System.out.print(num3 + " <= ");
			if (num1 <= num2)
				System.out.println(num1 + " <= " + num2);
			else
				System.out.println(num2 + " <= " + num1);
		}
		

	}
}