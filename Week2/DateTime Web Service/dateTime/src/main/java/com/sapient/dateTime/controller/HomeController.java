package com.sapient.dateTime.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	
	@GetMapping("/")
	public String welcomeGetUser() {
		return "home";
	}
	
	@RequestMapping(value="/", method = RequestMethod.GET)
	public String welcomeUser( ) {
		System.out.println("Reached the base url");
		return "home" ;
	}
	

	@RequestMapping(value="/selection", method = RequestMethod.GET)
	public String choiceSelection(@RequestParam String choice ) {
		if ( choice == "add_subtract")
			return "page1";
		else if ( choice == "get_week_day")
			return "page2";
		else if ( choice == "get_week_number")
			return "page3";
		else if( choice == "natural_lang")
			return "page4";
		else return "home";
	}
	
}
