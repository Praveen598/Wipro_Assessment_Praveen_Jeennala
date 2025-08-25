package Time_Api;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

public class LOcalDate {
	
	public static void main(String[] args) {
		//time
		LocalTime time=LocalTime.now();
		System.out.println(time);
		//Date
		
		LocalDate date=LocalDate.now();
		System.out.println(date);
		//date and time 
		
		LocalDateTime dt=LocalDateTime.now();
		System.out.println(dt);
		//period
		LocalDate ll=LocalDate.of(2000, 5, 23);
		Period p=Period.between(date, ll);
		System.out.println(p.getYears());
		//duration 
		LocalTime start=LocalTime.of(9, 50);
		LocalTime end=LocalTime.of(10, 50);
		
		Duration d=Duration.between(start, end);
		System.out.println(d.toMinutes());
		
	}

}
