package com.sapient.dateTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan({"com.sapient.dateTime"})
public class DateTimeCalculatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(DateTimeCalculatorApplication.class, args);
	}

}
