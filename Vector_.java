package Day31_12Aug;

import java.util.Vector;

public class Vector_ 
{
	public static void main(String[] args) 
	{
		Vector x1 = new Vector();
		x1.add(56);
		x1.add(null);
		x1.add(null);
		x1.add(null);
		for(double i= 1.0; i<100; i++)
		{
			x1.add(i);
		}
		System.out.println(x1);
	}
}
