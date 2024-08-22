package Day31_12Aug;

import java.util.PriorityQueue;

public class PriorityQueue_ 
{
	public static void main(String[] args) 
	{
		PriorityQueue s1 = new PriorityQueue();
	/*	s1.add(null);
		s1.add(null);
		s1.add(null);	*/
		s1.add(100);
		s1.add(100);
		for(int b = 1; b < 50.0 ; b++  )
		{
			s1.add(b);
		}
		for(double a = 1.0; a < 50.0 ; a++  )
		{
			s1.add(a);
		}
		System.out.println(s1);
	}
}
