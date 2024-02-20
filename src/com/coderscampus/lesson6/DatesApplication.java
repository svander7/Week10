package com.coderscampus.lesson6;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DatesApplication {

	public static void main(String[] args) {
		
//		lesson6();
//		lesson7();

		Calendar cal = Calendar.getInstance();
		cal.set(2020, 0, 1);
		Date jan1 = cal.getTime();
		
		System.out.println(jan1);
		DateFormat formatter = new SimpleDateFormat("yyyy-MMMM-dd HH:mm:ss z");
		String formattedDate = formatter.format(jan1);
		System.out.println(formattedDate);
		
		String dateValue1 = "2020-01-05 5:00 PM";
		String dateValue2 = "2019-01-01 10:00 AM";
		
		DateFormat formatter2 = new SimpleDateFormat("yyyy-MM-dd h:mm a");
		Date date1;
		Date date2;
		try {
			date1 = formatter2.parse(dateValue1);
			date2 = formatter2.parse(dateValue2);
			if (date1.before(date2)) {
				System.out.println("date1 is before date2");
			} else {
				System.out.println("date1 is after date2");
			}
				
		} catch (ParseException e) {
			e.printStackTrace();
		}
				
		
	}

	public static void lesson7() {
		//  This is outdated, use Calendar approach.
		Date jan012020 = new Date(120, 0, 1, 0, 0, 0);
		Calendar cal = Calendar.getInstance();
		System.out.println(jan012020);
		
		//  This is the Calendar approach.
		Date someOtherDate = cal.getTime();
		cal.set(2020, 0, 1, 15, 1, 5);
		someOtherDate = cal.getTime();
		System.out.println(someOtherDate);
		
		cal.add(Calendar.HOUR, 2);
		System.out.println(cal.getTime());
		
		cal.add(Calendar.MINUTE, -1);
		System.out.println(cal.getTime());
		
		Date now = new Date();
		if (now.after(cal.getTime())) {
			System.out.println(now + " is after " + cal.getTime());
		}
	}

	public static void lesson6() {
		Date now = new Date();
		System.out.println(now);
		
		java.sql.Date jan011970 = new java.sql.Date(86400000);
		System.out.println(jan011970);
	}

}
