import java.util.Scanner;

public class LetterCounting {

	public static void main(String[] args) {
		//Create a scanner for reading console
		Scanner input = new Scanner(System.in);

		//Ask for String and read
		System.out.print("Please enter a String value: ");
		String string = input.nextLine();
		
		//Print output
		System.out.println("There are " + countLetters(string) + " letters in \"" + string + "\".");
	}


	public static int countLetters(String s) {
		int number = 0;
		for (int i = 0; i < s.length(); i++) {
			if (Character.isLetter(s.charAt(i)))
				number += 1;
		}
		return number;
	}
	
}
