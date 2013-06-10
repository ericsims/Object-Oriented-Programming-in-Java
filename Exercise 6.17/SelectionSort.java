import java.util.Scanner;

public class SelectionSort {

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

		//Sort numbers
		selectionSort(numbers);
		
		//Print array
		System.out.println("The sorted list of numbers is: ");
		for (double value: numbers){
			System.out.print(value + " ");
		}
	}
	
	
	public static void selectionSort(double[] list) {
		for (int i = 0; i < list.length - 1; i++) {
			double currentMax = list[list.length - 1 - i];
			int currentMaxIndex = list.length - 1 - i;

			for (int j = i + 1; j < list.length; j++) {
				if (currentMax < list[list.length - 1 - j]) {
					currentMax = list[list.length - 1 - j];
					currentMaxIndex = list.length - 1 - j;
				}
			}
			
			if (currentMaxIndex != list.length - 1 - i) {
				list[currentMaxIndex] = list[list.length - 1 - i];
				list[list.length - 1 - i] = currentMax;
			}
			
		}
	}
	
	
}
