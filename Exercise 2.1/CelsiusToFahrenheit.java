import java.util.Scanner;

public class CelsiusToFahrenheit {

	public static final String DEGREE_SYMBOL = "\u00b0";

	public static void main(String[] args) {

		//Create a scanner for reading console
		Scanner input = new Scanner(System.in);

		//Ask for temperature
		System.out.print("Enter a temperature in celsius: ");

		//Read console input
		double temperatureCelsius = input.nextDouble();

		//Calculate fahrenheit temperature
		double temperatureFahrenheit = (9.0 / 5) * temperatureCelsius +32; 

		//Print output
		System.out.println(temperatureCelsius + DEGREE_SYMBOL + " Celsius is " + temperatureFahrenheit + DEGREE_SYMBOL + " Fahrenheit");

	}

}
