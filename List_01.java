package Day29_30_9Aug;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class List_01 
{
	public static void main(String[] args) 
	{
		List q1 = new ArrayList();
//		q1.add("Happy");
		q1.add(10);
		q1.add(20);
		q1.add(30);
		q1.add(40);
//		q1.add(null);
//		q1.add(null);
//		q1.add(null);
		q1.add(30);
		System.out.println(q1);
		
		// by sorting happy in //
		
		Collections.sort(q1);
		System.out.println(q1);
		
		Iterator q2	= q1.iterator();
			while(q2.hasNext())
			{
				System.out.println(q2.next());
			}
		
		ListIterator q5 = q1.listIterator();
		
		System.out.println("Forward Iteration using list Iteration");
		while(q5.hasNext())
		{
			System.out.println(q5.next());
		}
		
		System.out.println("Backward Iteration using list Iteration");
		while(q5.hasPrevious())
		{
			System.out.println(q5.previous());
		}
		
		
	}
}
