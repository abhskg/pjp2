package com.sapient.util;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

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
