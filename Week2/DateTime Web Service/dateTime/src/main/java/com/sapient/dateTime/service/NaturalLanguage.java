package com.sapient.dateTime.service;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.springframework.stereotype.Service;

import com.sapient.dateTime.util.DatePOJO;

@Service
public class NaturalLanguage extends DateTimeService{
	
	public NaturalLanguage() {
		super();
	} 
	
	String formStatementUsingDays(String date) {

		Date today = new Date();
		Date inputDate = new DatePOJO(date).getDate();
		boolean negative = false ;
		
		long duration = Math.abs(today.getTime() - inputDate.getTime());
		if (duration < 0) negative = true ;
		long difference = TimeUnit.DAYS.convert(duration, TimeUnit.MILLISECONDS);
		
		if ( negative ) {
			if( difference == 1 )	return " Yesterday ";
			else if( difference == 2 )	return " Day Before Yesterday " ;
			else {
				return Integer.toString((int)difference) + " days earlier ";
			}
		} else {
			if( difference == 1 )	return " Tomorrow ";
			else if( difference == 2 )	return " Day After Tomorrow " ;
			else {
				return Integer.toString((int)difference) + " days from now";
			}
		}	
	}
	
	String formStatementUsingWeeks(String date) {

		Date today = new Date();
		Date inputDate = new DatePOJO(date).getDate();
		boolean negative = false ;
		
		long duration = Math.abs(today.getTime() - inputDate.getTime());
		if (duration < 0) negative = true ;
		long difference = TimeUnit.DAYS.convert(duration, TimeUnit.MILLISECONDS);
		difference = difference / 7; 
		if ( negative ) {
			if( difference == 1 )	return " Last Week ";
			else	return Integer.toString((int)difference) + " weeks earlier ";
			
		} else {
			if( difference == 1 )	return " Next Week";
			else 	return Integer.toString((int)difference) + " weeks from now";
		}		
	}	
	
	String formStatementUsingMonths(String date) {

		Date today = new Date();
		Date inputDate = new DatePOJO(date).getDate();
		boolean negative = false ;
		
		long duration = Math.abs(today.getTime() - inputDate.getTime());
		if (duration < 0) negative = true ;
		long difference = TimeUnit.DAYS.convert(duration, TimeUnit.MILLISECONDS);
		difference = difference / 30; 
		if ( negative ) {
			if( difference == 1 )	return " Last Month";
			else	return Integer.toString((int)difference) + " Months earlier ";
			
		} else {
			if( difference == 1 )	return " Next Month ";
			else 	return Integer.toString((int)difference) + " Months from now";
		}		
	}

	String formStatementUsingYears(String date) {

		Date today = new Date();
		Date inputDate = new DatePOJO(date).getDate();
		boolean negative = false ;
		
		long duration = Math.abs(today.getTime() - inputDate.getTime());
		if (duration < 0) negative = true ;
		long difference = TimeUnit.DAYS.convert(duration, TimeUnit.MILLISECONDS);
		difference = difference / 365; 
		if ( negative ) {
			if( difference == 1 )	return " Last Year";
			else	return Integer.toString((int)difference) + " Years earlier ";
			
		} else {
			if( difference == 1 )	return " Next Year";
			else 	return Integer.toString((int)difference) + " Years from now";
		}		
	}
}
