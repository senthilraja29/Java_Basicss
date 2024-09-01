package Day39_40_23Aug;

import java.util.Date;

public class Date_class_ 
{
	public static void main(String[] args) 
	{
		Date d1 = new Date();
		System.out.println(d1.getTime());
		Date d2 = new Date(d1.getTime());
		System.out.println(d2);
		String time = d2.toString();
		
		String Month = time.substring(4, 7);
		System.out.println(Month);
		String date = time.substring(8, 10);
		System.out.println(date);
		String year = time.substring(time.length()-4);
		System.out.println(year);			
	}
}
