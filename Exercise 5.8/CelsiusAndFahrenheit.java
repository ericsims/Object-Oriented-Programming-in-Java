public class CelsiusAndFahrenheit {

	public static final double ACCURACY = 100.0; //1 = no decimals, 10 = 10ths place, 100 = 100ths.... 
	public static final String DEGREE_SYMBOL = "\u00b0";

	public static void main(String[] args) {
		//Declare variables
		double celsius = 40.0;
		double fahrenheit = 120.0;

		//Loop calculations and print output
		System.out.println("Celsius \tFahrenheit \tFahrenheit \tCelsius \n");
		while (celsius >= 31.0) {
			System.out.print(celsius + DEGREE_SYMBOL + "\t\t");
			System.out.print(CelsiusToFahrenheit(celsius) + DEGREE_SYMBOL + "\t\t");
			System.out.print(fahrenheit + DEGREE_SYMBOL + "\t\t");
			System.out.print(FahrenheitToCelsius(fahrenheit) + DEGREE_SYMBOL + "\n");

			celsius = celsius - 1.0;
			fahrenheit = fahrenheit - 10.0;
		}

	}

	public static double CelsiusToFahrenheit(double celsius) {
		return  Math.round((ACCURACY)*(   (9.0 / 5) * celsius + 32   ))/ACCURACY;
	}

	public static double FahrenheitToCelsius(double fahrenheit) {
		return Math.round((ACCURACY)*(   (fahrenheit - 32) * (5.0 / 9)   ))/ACCURACY; 
	}
}