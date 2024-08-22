package Day34_15Aug;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Map_interger1_integer2 
{
	public static void main(String[] args) 
	{
		Map<Integer, Double> v1 = new HashMap<Integer, Double>();
			v1.put(1001, 87634.58);
			v1.put(1002, 77534.58);
			v1.put(1003, 81694.58);
			v1.put(1004, 47434.58);
		
		for(Integer m1 : v1.keySet())
		{
			System.out.println("Employye ID " + m1);
		}
		for(Double m2 : v1.values())
		{
			System.out.println("Salary " + m2);
		}
		
		System.out.println("Method 2");
		for(Entry<Integer,Double> s1 : v1.entrySet())
		{
			System.out.println("Employee and salary is " + s1);
		}
		
		Iterator<Entry<Integer,Double>> i1 = v1.entrySet().iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		//		Set<Entry<Integer, Double>> c1 = v1.entrySet();
		
	}
}
