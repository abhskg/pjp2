package com.sapient.util;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class DatePOJO implements Serializable{

//	Default Serial Version ID
	private static final long serialVersionUID = 1L;
	Date date;
	LocalDate localDate;

	public DatePOJO() {
		super();
	}
	
	public DatePOJO(String textDate){
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy"); 		
		try {
			this.date = format.parse(textDate);			
//		Filling in LocalDate
			ConvertDateAndLocalDate convert = new ConvertDateAndLocalDate() ;
			localDate = convert.convertDateToLocalDate(this.date);
		} catch (ParseException e) {
			System.out.println(" INVALID FORMAT OR DATE : Error encountered while PARSING\n");
			e.printStackTrace();
		}
	}
	
	public Date getDate() {
		return date;
	}
	
	public LocalDate getLocalDate() {
		return localDate;
	}

	public void setDate(String textDate) {
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");		
		try {
			this.date = format.parse(textDate);
		} catch (ParseException e) {
			System.out.println(" INVALID FORMAT OR DATE : Error encountered while PARSING\n");
			e.printStackTrace();
		}
	}

	@Override
	public String toString() {
		return "<-- Date :=> " + date + " -->";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		
		if (!(obj instanceof DatePOJO))
			return false;
		DatePOJO other = (DatePOJO) obj;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		return true;
	}
	
	
	
}
