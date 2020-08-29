package com.sapient.dateTime.util;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class ConvertDateAndLocalDate {
	
	public LocalDate convertDateToLocalDate( Date date ) {
		return date.toInstant()
				.atZone(ZoneId.systemDefault())
				.toLocalDate();
	}
	
	public Date convertLocalDateToDate (LocalDate date ) {
		return Date.from(date.atStartOfDay()
				.atZone(ZoneId.systemDefault())
				.toInstant());
	}
	
}
