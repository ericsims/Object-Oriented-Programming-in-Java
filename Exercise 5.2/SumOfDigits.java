import java.util.Scanner;

public class SumOfDigits {
	public static void main(String[] args) {
		//Create a scanner for reading console
		Scanner input = new Scanner(System.in);

		//Ask for and read a long a number
		System.out.print("Enter a number: ");
		long l = input.nextLong();

		//Find the sum of the digits, and print
		System.out.println("The sum of the digits in " + l + " is: " + sumDigits(l));
	}

	public static int sumDigits(long n) {
		int sum = 0;
		while (n != 0){
			sum += n % 10;
			n = n / 10;
		}

		return sum;
		//Sort and print the numers

	}
}