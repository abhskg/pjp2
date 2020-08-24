import java.util.Date;

import com.sapient.service.*;
import com.sapient.util.InputReader;

public class DateTimeCalculator {

	InputReader reader;
	
	static DateTimeService service ; 
	
	DateTimeUI dateTimeMenu;
	
	
	public static void main(String[] args) {
		
		Date d1 = new Date(), d2 = new Date() ;
		
		Date date = service.addToDate(d1);
		
		date = service.subtractFromDate(d1);
		
		Integer diff = service.differenceBetweenDates(d1,d2);
		
		String day = service.dayOfWeek(d1);

		Integer weekNumber = service.getWeekNumber(d1);
		
		
		
	}
	
}
