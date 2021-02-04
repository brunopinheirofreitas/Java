package FifithCourse;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Datas {
	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		System.out.println(today);
		
		LocalDate japanOlympics = LocalDate.of(2021, Month.JULY, 22);
		
		int timeLeftForOlympcs = japanOlympics.getDayOfYear() - today.getDayOfYear();
		System.out.println(timeLeftForOlympcs);
		
		System.out.println("------------Period-----------");
		Period period = Period.between(today, japanOlympics);
		System.out.println(period.getDays());
		
		System.out.println("------------Aritimethical-----------");
		LocalDate nextOlympics = japanOlympics.plusYears(4);
		System.out.println(nextOlympics.getYear());
		
		System.out.println("------------Fromating dates-----------");
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String formatedDate = nextOlympics.format(format);
		System.out.println(formatedDate);
		
		
	}

}
