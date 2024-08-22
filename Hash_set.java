package Day31_12Aug;

import java.util.HashSet;

public class Hash_set 
{
	public static void main(String[] args) 
	{
		HashSet q1 =  new HashSet();
		q1.add("Happy");
		q1.add(null);
		q1.add(null);
		q1.add(null);
		for(int b = 1; b < 50.0 ; b++  )
		{
			q1.add(b);
		}
		for(double a = 1.0; a < 50.0 ; a++  )
		{
			q1.add(a);
		}
		System.out.println(q1);
	}
}
