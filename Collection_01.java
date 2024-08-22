package Day29_30_9Aug;

import java.util.ArrayList;
import java.util.Collection;


public class Collection_01 
{
public static void main(String[] args) 
{
	Collection c1 = new ArrayList();
	c1.add("Age");
	c1.add("cOLOUR");
	c1.add(76);
	c1.add(false);
	c1.add(7.14);
	System.out.println(c1);
	
	Collection c2 = new ArrayList();
	c2.addAll(c1);
	c2.add("Defence");
	c2.add("India");
	System.out.println(c2);
	
	boolean b1 = c2.equals(c1);
	System.out.println(b1);
	
	boolean b2 = c2.isEmpty();
	System.out.println(b2);
	
/*	c1.clear();
	System.out.println(c1);		*/
	
	c1.remove(76);
	System.out.println(c1);
	
	c2.removeAll(c1);
	System.out.println(c2);
	
	boolean b3 = c2.containsAll(c1);
	System.out.println(b3);
	
	c1.add(null);
	c1.add(null);
	c1.add(null);
	c1.add(null);
	System.out.println(c1);
	
	System.out.println(c1.iterator());
}
}
