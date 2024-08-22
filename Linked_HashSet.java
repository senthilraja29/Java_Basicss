package Day31_12Aug;

import java.util.LinkedHashSet;

public class Linked_HashSet 
{
	public static void main(String[] args) 
	{
		LinkedHashSet w1 = new LinkedHashSet();
		w1.add(null);
		w1.add(null);
		w1.add(null);
		w1.add("123");
		for(int b = 1; b < 50.0 ; b++  )
		{
			w1.add(b);
		}
		for(double a = 1.0; a < 50.0 ; a++  )
		{
			w1.add(a);
		}
		System.out.println(w1);
		

	}
}
