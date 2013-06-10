import java.util.Scanner;

public class MinutesToYears {

	public static void main(String[] args) {

		//Create a scanner for reading console
		Scanner input = new Scanner(System.in);

		//Ask for and read number of minutes
		System.out.print("Enter a number of minutes: ");
		int minutes = input.nextInt();

		//Calculate cylinder area and volume
		int years = (minutes / 60 / 24) / 365;
		int days = (minutes / 60 / 24) % 365;

		//Print output
		System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days");

	}
}