package Day31_12Aug;

import java.util.LinkedList;

public class LinkedList_ 
{
	public static void main(String[] args) 
	{
	LinkedList q1 = new LinkedList();
	q1.add("Happy");
	q1.add(null);
	q1.add(null);
	q1.add(null);
	q1.add(null);
	for(int i= 1; i<100;i++)
	{
		q1.add(i);
	}
	System.out.println(q1);
	}
}
