package com.sapient.dateTime.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.sapient.dateTime.service.DateTimeService;
import com.sapient.dateTime.util.DatePOJO;

@Controller
public class DateTimeController {

	@Autowired
	DateTimeService service ;
	
	SimpleDateFormat dateFormat ;
	

	@InitBinder
	protected void initBinder(WebDataBinder binder) {
		dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		binder.registerCustomEditor(Date.class, new CustomDateEditor(
				dateFormat, false));
	}
	
//	ARITHMETIC REQUEST ADD 
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String addToDate(ModelMap model, @RequestParam Date date_add, @RequestParam Long num_of_days) {
		String textDate = dateFormat.format(date_add);
		Date result = service.addDaysToDate(new DatePOJO(textDate), num_of_days);
		
		model.addAttribute("result", dateFormat.format(result));
		return "result";
	}
	

//	ARITHMETIC REQUEST Subtract
	@RequestMapping(value = "/subtract", method = RequestMethod.GET)
	public String subtractFromToDate(ModelMap model, @RequestParam Date date_subtract, @RequestParam Long num_of_days) {
		String textDate = dateFormat.format(date_subtract);
		Date result = service.subtractDaysFromDate(new DatePOJO(textDate), num_of_days);
		model.addAttribute("result", dateFormat.format(result));
		return "result";
	}

//	ARITHMETIC REQUEST Difference
	@RequestMapping(value = "/diff", method = RequestMethod.GET)
	public String differenceBetweenDate(ModelMap model,@RequestParam Date date_add,@RequestParam Date date_subtract) {
		String textDate1 = dateFormat.format(date_add);
		String textDate2 = dateFormat.format(date_subtract);
		
		Integer differenceBetweenDatesInDays = service.differenceBetweenDatesInDays(new DatePOJO(textDate1), new DatePOJO(textDate2));
		
		model.addAttribute("result", differenceBetweenDatesInDays);
		return "result";
	}

//	WEEK Day EVALUATION 
	@RequestMapping(value = "/weekDay", method = RequestMethod.GET)
	public String getWeekDay(ModelMap model, @RequestParam Date date) {
		String textDate = dateFormat.format(date);
		String dayOfWeek = service.dayOfWeek(new DatePOJO(textDate));
		
		model.addAttribute("result", dayOfWeek);
		return "result";
	}
	
//	WEEK NUMBER EVALUATION 
	@RequestMapping(value = "/weekNum", method = RequestMethod.GET)
	public String getWeekNumber(ModelMap model, @RequestParam Date date) {
		String textDate = dateFormat.format(date);
		Integer weekNumber = service.getWeekNumber(new DatePOJO(textDate));
		
		model.addAttribute("result", weekNumber);
		return "result";
	}
	
	
}
