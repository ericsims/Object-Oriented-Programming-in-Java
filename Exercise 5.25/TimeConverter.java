import java.util.Scanner;

public class TimeConverter {
	public static void main(String[] args) {
		//Create a scanner for reading console
		Scanner input = new Scanner(System.in);

		//Ask for and read milliseconds
		System.out.print("Enter a number of milliseconds: ");
		long millis = input.nextLong();

		//Finds time and print
		System.out.println(millis + " milliseconds is " + convertMillis(millis));
	}

	public static String convertMillis(long millis) {
		String time = "";

		time += String.valueOf(millis / 3600000);
		millis = millis % 3600000;

		time += ":";

		time += String.valueOf(millis / 60000);
		millis = millis % 60000;

		time += ":";

		time += String.valueOf(millis / 1000);
		millis = millis % 1000;

		return time;
	}

}