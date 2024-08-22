package Day31_12Aug;

import java.util.ArrayList;

public class Array_list 
{
public static void main(String[] args) 
{
	
	ArrayList a3 = new ArrayList();
	a3.add(100);
	a3.add("Happy");
	a3.add(null);
	a3.add(null);
	a3.add(null);
	for(int i = 1; i <= 100; i++) 
	{
		a3.add(i);
	}
	System.out.println(a3);
	
}
}
