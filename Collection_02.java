package Day29_30_9Aug;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Collection_02 
{

public static void main(String[] args) 
{
	Collection x1 = new ArrayList();
	x1.add(6.746813835846414894);
	x1.add(88);
	x1.add(true);
	x1.add(354);
	x1.add(3.14);
	System.out.println(x1);
	
	Iterator<Object> i1 = x1.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
	System.out.println(x1.size());
}
}
