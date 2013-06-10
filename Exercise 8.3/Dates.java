import java.util.Date;
public class Dates {
	public static void main(String[] args) {
		//Create Date object and declare message
		Date date = new Date();
		String message = " milliseconds past 1/1/1970 GMT is: ";
		
		//Set times and print
		date = new Date(10000L);
		System.out.println(10000L + message + date.toString());

		date = new Date(100000L);
		System.out.println(100000L + message + date.toString());

		date = new Date(1000000L);
		System.out.println(1000000L + message + date.toString());
		
		date = new Date(1000000L);
		System.out.println(1000000L + message + date.toString());
		
		date = new Date(10000000L);
		System.out.println(10000000L + message + date.toString());

		date = new Date(1000000000L);
		System.out.println(1000000000L + message + date.toString());
		
		date = new Date(10000000000L);
		System.out.println(10000000000L + message + date.toString());
		
		date = new Date(100000000000L);
		System.out.println(100000000000L + message + date.toString());
	}
}
