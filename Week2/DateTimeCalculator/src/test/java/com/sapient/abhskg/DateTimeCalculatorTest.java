package com.sapient.abhskg;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.sapient.service.DateTimeService;
import com.sapient.util.DatePOJO;

public class DateTimeCalculatorTest {

	DatePOJO bDay = new DatePOJO("15/07/1998") ; 
	static DateTimeService service ;
	
	@BeforeClass 
	public void environmentSetup(){
		service = new DateTimeService();		
	}
	
	@Before
	public void setup() {
	}
	
	@Test
	public void testBasic() {
		System.out.println(bDay);
//		assertEquals(bDay, service.addToDate(bDay, 0));
	}
	
	@Test
	public void testWeek() {

		System.out.println(service.getWeekNumber(bDay));
		System.out.println(service.dayOfWeek(bDay));
		assertEquals("WEDNESDAY", service.dayOfWeek(bDay));
	}

	
}
