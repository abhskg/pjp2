package com.sapient.dateTime.service;

import java.util.Date;
import java.time.*;
import java.time.temporal.WeekFields;

import com.sapient.dateTime.util.ConvertDateAndLocalDate;
import com.sapient.dateTime.util.DatePOJO;

public class DateTimeService {

	public ConvertDateAndLocalDate convert ;
	
	public DateTimeService() {
		super();
		convert = new ConvertDateAndLocalDate();
	}

	public Date addDaysToDate(DatePOJO date, Long days) {
		LocalDate tempDate = date.getLocalDate();
		LocalDate resultLocalDate = tempDate.plusDays(days);
		Date resultDate = convert.convertLocalDateToDate(resultLocalDate); 
		return resultDate;
	}

	public Date subtractDaysFromDate(DatePOJO date, Long days) {
		LocalDate tempDate = date.getLocalDate();
		LocalDate resultLocalDate = tempDate.plusDays((-1)*days);
		Date resultDate = convert.convertLocalDateToDate(resultLocalDate); 
		return resultDate;		
	}

	public Date addWeeksToDate(DatePOJO date, Long weeks) { 
		LocalDate tempDate = date.getLocalDate();
		LocalDate resultLocalDate = tempDate.plusWeeks(weeks);
		Date resultDate = convert.convertLocalDateToDate(resultLocalDate); 
		return resultDate;
	}

	public Date subtractWeeksFromDate(DatePOJO date, Long weeks) { 
		LocalDate tempDate = date.getLocalDate();
		LocalDate resultLocalDate = tempDate.plusDays((-1)*weeks);
		Date resultDate = convert.convertLocalDateToDate(resultLocalDate); 
		return resultDate;		
	}

	public Date addMonthsToDate(DatePOJO date, Long months) { 
		LocalDate tempDate = date.getLocalDate();
		LocalDate resultLocalDate = tempDate.plusWeeks(months);
		Date resultDate = convert.convertLocalDateToDate(resultLocalDate); 
		return resultDate;
	}

	public Date subtractMonthsFromDate(DatePOJO date, Long months) { 
		LocalDate tempDate = date.getLocalDate();
		LocalDate resultLocalDate = tempDate.plusDays((-1)*months);
		Date resultDate = convert.convertLocalDateToDate(resultLocalDate); 
		return resultDate;		
	}
	
	public Integer differenceBetweenDatesInDays(DatePOJO d1, DatePOJO d2) {
		Period differnce = Period.between(d1.getLocalDate(), d2.getLocalDate());
		return differnce.getDays();
	}

	public Integer differenceBetweenDatesInWeeks(DatePOJO d1, DatePOJO d2) {
		Period differnce = Period.between(d1.getLocalDate(), d2.getLocalDate());
		return (differnce.getDays() /7);
	}
	
	public Integer differenceBetweenDatesInMonths(DatePOJO d1, DatePOJO d2) {
		Period differnce = Period.between(d1.getLocalDate(), d2.getLocalDate());
		return differnce.getMonths();
	}
	
	public Integer differenceBetweenDatesInYears(DatePOJO d1, DatePOJO d2) {
		Period differnce = Period.between(d1.getLocalDate(), d2.getLocalDate());
		return differnce.getYears();
	}
	
	public String dayOfWeek(DatePOJO date) {
		LocalDate localDate = date.getLocalDate();
		DayOfWeek dayOfWeek = localDate.getDayOfWeek(); 
		return dayOfWeek.name();
	}

	public Integer getWeekNumber(DatePOJO date) {
		return date.getLocalDate()
				.get(WeekFields.of(DayOfWeek.SUNDAY, 1)
						.weekOfYear()
						);
	}


	
}
