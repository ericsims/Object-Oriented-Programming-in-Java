import java.util.Scanner;

public class ISBNCheck {
	public static void main(String[] args) {

		//Create a scanner for reading console
		Scanner input = new Scanner(System.in);

		//Ask for and read first 9 integers
		System.out.print("Please enter the first 9 integers: ");
		int d1 = input.nextInt();
		int d2 = input.nextInt();
		int d3 = input.nextInt();
		int d4 = input.nextInt();
		int d5 = input.nextInt();
		int d6 = input.nextInt();
		int d7 = input.nextInt();
		int d8 = input.nextInt();
		int d9 = input.nextInt();

		//Calculate checksum
		int d10 = (d1*1 + d2*2 + d3*3 + d4*4 + d5*5 + d6*6 + d7*7 + d8*8 + d9*9) % 11;
		
		//Print output
		System.out.print(d1);
		System.out.print(d2);
		System.out.print(d3);
		System.out.print(d4);
		System.out.print(d5);
		System.out.print(d6);
		System.out.print(d7);
		System.out.print(d8);
		System.out.print(d9);
		System.out.print(d10);
		
	}
}