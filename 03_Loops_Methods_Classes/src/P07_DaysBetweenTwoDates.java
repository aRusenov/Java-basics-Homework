import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;


public class P07_DaysBetweenTwoDates {
	// sets the format for parsing dates
	public static final SimpleDateFormat FORMATTER = new SimpleDateFormat("dd-MM-yyyy");
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		try {
			Date first = FORMATTER.parse(input.nextLine());
			Date second = FORMATTER.parse(input.nextLine());
			// calculates the difference between the two dates in milliseconds
			long diff = second.getTime() - first.getTime();
			// gets the days by dividing the msec by 1000, 60 secs, 60 mins, 24 hours
			long diffDays = Math.round(((double)diff / (24 * 60 * 60 * 1000)));
			System.out.println(diffDays);
		} catch (ParseException e) {
			
			e.printStackTrace();
		}
		
	}

}
