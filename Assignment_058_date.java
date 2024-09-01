package Day39_40_23Aug;

import java.time.LocalTime;
import java.util.Date;

public class Assignment_058_date 
{
	public static void main(String[] args) 
	{
		Date day1 = new Date();
		System.out.println(day1.getDate());
		Date day2 = new Date(day1.getDate());
		System.out.println(day2);
		String day2_time = day2.toString();
		System.out.println(day2_time);
		
		LocalTime time = LocalTime.now();
		System.out.println("Current time is " + time);
		
		LocalTime past = time.minusHours(2);
		System.out.println("2 Hour Before Current Time " + past);
		
		LocalTime future = time.plusHours(2);
		System.out.println("2 Hour After Current Time " + future);
	}
}
