import java.util.Scanner;

public class QuadraticEquations {
	public static void main(String[] args) {

		//Create a scanner for reading console
		Scanner input = new Scanner(System.in);

		//Ask for and read a, b, and c.
		System.out.print("Please enter a, b, and c: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();

		//Calculate discriminant
		double discriminant = Math.pow(b, 2) - 4 * a * c;

		//Calculate roots
		double r1 = (-b + Math.pow(discriminant, 0.5)) / (2 * a);
		double r2 = (-b - Math.pow(discriminant, 0.5)) / (2 * a);
		
		//Print output
		if (discriminant > 0) {
			System.out.println("The roots are " + r1 + " and " + r2);
		} else if (discriminant < 0) {
			System.out.println("There are no real roots");
		} else {
			System.out.println("The root is " + r1);
		}

	}
}
