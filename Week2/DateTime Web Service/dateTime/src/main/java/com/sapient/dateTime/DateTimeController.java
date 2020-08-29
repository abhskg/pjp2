package com.sapient.dateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.sapient.dateTime.service.DateTimeService;

@RestController
public class DateTimeController {

	@Autowired
	DateTimeService service ;
	
	
	
}
