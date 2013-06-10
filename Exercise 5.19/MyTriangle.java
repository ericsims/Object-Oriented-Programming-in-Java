import java.util.Scanner;

public class MyTriangle {
	public static void main(String[] args) {
		//Create a scanner for reading console
		Scanner input = new Scanner(System.in);

		//Ask for and read 3 side lengths
		System.out.print("Enter 3 triange side lengths: ");
		double s1 = input.nextDouble();
		double s2 = input.nextDouble();
		double s3 = input.nextDouble();

		//Finds area and validity and prints
		if (isValid(s1, s2, s3)) {
		System.out.println("The area of a triange with side lengths "
								+ s1 + ", " + s2 + ", and " + s3 + " is:\n"
								+ area(s1, s2, s3));
		} else {
			System.out.println(s1 + ", " + s2 + ", and " + s3 + " are not valid triangle side lengths!");
		}
	}

	public static boolean isValid(double side1, double side2, double side3) {
		if (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1) {
			return true;
		} else {
			return false;
		}
	}
	
	public static double area(double side1, double side2, double side3) {
		double s = (side1 + side2 + side3) / 2;
		return Math.sqrt( (s)*(s - side1)*(s - side2)*(s - side3) );
	}
	
}