import java.util.Scanner;

public class IsANumberEven {
	public static void main(String[] args) {

		//Create a scanner for reading console
		Scanner input = new Scanner(System.in);

		//Ask for and read integer
		System.out.print("Please enter an integer: ");
		int number = input.nextInt();

		//Decide if the number is even
		boolean even = false;
		if (number % 2 == 0) 
			even = true;
		
		//Print output
		System.out.println("Is " + number + " an even number? " + even);

	}
}