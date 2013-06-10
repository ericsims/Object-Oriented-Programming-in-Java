import java.util.Scanner;

public class AveragingAnArray {

	public static void main(String[] args) {
		//Create a scanner for reading console
		Scanner input = new Scanner(System.in);

		//Create array
		double[] numbers = new double[10];

		//Ask for and read 10 numbers
		System.out.print("Enter 10 numbers: ");
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextDouble();
		}

		//Find the sum of the digits, and print
		System.out.println("The average value is: " + average(numbers));
	}


	public static double average(double[] array) {
		double average = 0;
		for (double value: array) {
			average += value;
		}
		average = average / array.length;
		return average;
	}

	public static int average(int[] array) {
		int average = 0;
		for (int value: array) {
			average += value;
		}
		average = (int) (average / array.length);
		return average;
	}
}
