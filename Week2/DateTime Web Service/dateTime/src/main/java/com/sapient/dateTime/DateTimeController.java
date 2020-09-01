package com.sapient.dateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sapient.dateTime.service.DateTimeService;

@Controller
public class DateTimeController {

	@Autowired
	DateTimeService service ;
	
//	ARITHMETIC REQUEST ADD 
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String addToDate() {
		return "page1";
	}
	

//	ARITHMETIC REQUEST Subtract
	@RequestMapping(value = "/subtract", method = RequestMethod.GET)
	public String subtractFromToDate() {
		return "page1";
	}

//	ARITHMETIC REQUEST Difference
	@RequestMapping(value = "/diff", method = RequestMethod.GET)
	public String differenceBetweenDate() {
		return "page1";
	}

//	WEEK Day EVALUATION 
	@RequestMapping(value = "/weekDay", method = RequestMethod.GET)
	public String getWeekDay() {
		return "page1";
	}
	
//	WEEK NUMBER EVALUATION 
	@RequestMapping(value = "/weekNum", method = RequestMethod.GET)
	public String getWeekNumber() {
		return "page1";
	}
	
	
}
