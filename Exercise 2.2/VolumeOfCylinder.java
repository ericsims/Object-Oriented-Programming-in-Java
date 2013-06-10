import java.util.Scanner;

public class VolumeOfCylinder {

	public static void main(String[] args) {

		//Create a scanner for reading console
		Scanner input = new Scanner(System.in);

		//Ask for and read radius
		System.out.print("Enter a radius dimension: ");
		double cylinderRadius = input.nextDouble();

		//Ask for and read height
		System.out.print("Enter a height dimension: ");
		double cylinderHeight = input.nextDouble();

		//Calculate cylinder area and volume
		double cylinderArea = cylinderRadius * cylinderRadius * Math.PI;
		double cylinderVolume  = cylinderArea * cylinderHeight;

		//Print output
		System.out.println("The area of the cylinder is: " + cylinderArea);
		System.out.println("The volume of the cylinder is: " + cylinderVolume);

	}
}
