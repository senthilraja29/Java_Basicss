package Day32_13Aug;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Assignment_vector {

public static void main(String[] args) 
{
	Vector value = new Vector();
		value.add(1);
		value.add(2);
		value.add(3);
		value.add(2);
		value.add(1);
		
	System.out.println(value);
	Iterator		a = value.iterator();
	ListIterator	b = value.listIterator();
	Enumeration		c =	value.elements();
	
		System.out.println("Iterator");
		while(a.hasNext()) 
		{
			System.out.println(a.next());
		}
		System.out.println("ListIterator forward");
		while(b.hasNext()) 
		{
			System.out.println(b.next());
		}
		System.out.println("ListIterator Backward");
		while(b.hasPrevious()) 
		{
			System.out.println(b.previous());
		}
		System.out.println("Enumeration");
		while(c.hasMoreElements()) 
		{
			System.out.println(c.nextElement());	
		}
	}	
}


