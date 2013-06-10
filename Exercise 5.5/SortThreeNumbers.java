import java.util.Scanner;

public class SortThreeNumbers {
	public static void main(String[] args) {
		//Create a scanner for reading console
		Scanner input = new Scanner(System.in);
		
		//Ask for and read 3 numbers
		System.out.print("Enter the number of students: ");
		double n1 = input.nextDouble();
		double n2 = input.nextDouble();
		double n3 = input.nextDouble();
		
		//Sort and print
		displaySortedNumbers(n1, n2, n3);
	}

	public static void displaySortedNumbers(double num1, double num2, double num3) {
		//Sort and print the numers
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