package Day31_12Aug;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Assignment_052_Vector 
{
    public static void main(String[] args) 
    {
    	Vector<Integer> value = new Vector();
	    	value.add(10);
	    	value.add(20);
	    	value.add(30);
	    	
    	System.out.println("Iteration in Vector");
    		Iterator<Integer> i1 = value.iterator();
    	while(i1.hasNext()) 
    		{	System.out.println(i1.next());		}
    	
    	System.out.println("\nListIteration in Vector (Forward)");
    		ListIterator<Integer> i2 = value.listIterator();
    	
    	while(i2.hasNext())
    		{	System.out.println(i2.next());		}
    	
    	System.out.println("\nListIteration in Vector (Backward)");
    	while(i2.hasPrevious())
    		{	System.out.println(i2.previous());	}
    	
    	System.out.println("\nEnumerazation in Vector ");
    		Enumeration<Integer>  i3 = value.elements();
    	while(i3.hasMoreElements())
    		{	System.out.println(i3.nextElement()); }
    }
}