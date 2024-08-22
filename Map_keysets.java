package Day34_15Aug;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Map_keysets 
{
	public static void main(String[] args) 
	{
		Map<String,Integer> x1 = new HashMap<String,Integer>();
		x1.put("RaJu", 26);
		x1.put("Krishan", 22);
		x1.put("Kamsa", 20);
		x1.put("Bharatha", 18);
		System.out.println(x1);
		
		Set<String> x2 = x1.keySet();
		System.out.println(x2);
		
		System.out.println("Method - 1 of Iteration");
		for (String i1 : x1.keySet() )
		{
			System.out.println(i1);
		}
		for (Integer i2 : x1.values() )
		{
			System.out.println(i2);
		}
		
		System.out.println("\"Method - 2 of Iteration\"");
		for (Entry<String, Integer> q1 : x1.entrySet())
		{
			System.out.println(q1);
		}
		System.out.println("\"Method - 3 of Iteration\"");
		
		Iterator<Entry<String, Integer>> i2 =x1.entrySet().iterator();
		while(i2.hasNext())
		{
			System.out.println(i2.next());
		}
	
	}
}
