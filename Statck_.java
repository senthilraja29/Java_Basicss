package Day31_12Aug;

import java.util.Stack;

public class Statck_ 
{
	public static void main(String[] args) 
	{
		Stack z1 = new Stack();
		z1.add(null);
		z1.add(null);
		z1.add(null);
		for(double a = 1.0; a <50.0 ; a++  )
		{
			z1.add(a);
		}
		for(int b = 1; b < 50.0 ; b++  )
		{
			z1.add(b);
		}
		System.out.println(z1);
	}
}
