import java.util.Calendar;
import java.util.GregorianCalendar;

public class GregorianCal {
	public static void main(String[] args) {
		//Create GregorianCalendar object
		Calendar date = new GregorianCalendar();
		
		//Set print today's date
		System.out.println("Today is: " + date.get(date.MONTH) + "/" + date.get(date.DAY_OF_MONTH) + "/" + date.get(date.YEAR));

		//Set day in millis and print
		date.setTimeInMillis(1234567898765L);
		System.out.println("1234567898765L past 1/1/1970 is: " + date.get(date.MONTH) + "/" + date.get(date.DAY_OF_MONTH) + "/" + date.get(date.YEAR));
	}
}
