package Day32_13Aug;

import java.util.HashSet;
import java.util.Iterator;

public class Assignment_061_Hashset 
{
	public static void main(String[] args) 
	{
		HashSet<Integer> rsw = new HashSet();
			rsw.add(10);
			rsw.add(11);
			rsw.add(12);
			rsw.add(13);
			rsw.add(10);
		
		Iterator<Integer> rsw1 = rsw.iterator();
		//Iterator 
		while(rsw1.hasNext())
		{
			System.out.println(rsw1.next());
		}
				
		//Hashset not accept's duplicates
		//Hashset not accept's ListIterator 
	}
}
