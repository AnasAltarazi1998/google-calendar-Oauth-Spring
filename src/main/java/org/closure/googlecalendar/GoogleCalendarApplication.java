package org.closure.googlecalendar;

import java.io.IOException;
import java.security.GeneralSecurityException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
public class GoogleCalendarApplication {

	public static void main(String[] args) {
		SpringApplication.run(GoogleCalendarApplication.class, args);
		// CalendarService calendarService = new CalendarService();
		// try {
		// 	calendarService.calendarTest();
		// } catch (IOException | GeneralSecurityException e) {
		// 	System.out.println(e.getMessage());
		// }
	}

}
