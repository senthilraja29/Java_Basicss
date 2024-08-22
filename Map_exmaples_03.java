package Day34_15Aug;

import java.util.HashMap;
import java.util.Map;

public class Map_exmaples_03 
{
	public static void main(String[] args) 
	{
		Map<Integer, Double> v1 = new HashMap<Integer, Double>();
		
		v1.put(1001, 87634.58);
		v1.put(1002, 77534.58);
		v1.put(1003, 81694.58);
		v1.put(1004, 47434.58);
		
		v1.putIfAbsent(1005, null);
		System.out.println(v1);
		v1.putIfAbsent(1004, 10000.50);
		System.out.println(v1);
	}
}
