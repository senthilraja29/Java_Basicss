package Day33_14Aug;

import java.util.HashMap;
import java.util.Map;

public class Map_interface_ex_03 
{
	public static void main(String[] args) 
	{
		Map<String,Integer> bca = new HashMap<String,Integer>();
		bca.put("Rice", 50);
		bca.put("Potato", 3);
		bca.put("Tomato", 2);
		bca.put("Water", 30);
		bca.put("Salt", 1);
		System.out.println(bca);
	//	bca.clear();
		System.out.println(bca);
		Boolean bca1 = bca.isEmpty();
		System.out.println(bca1);
		Boolean bca2 = bca.containsKey("Potato");
		System.out.println(bca2);
		Boolean bca3 = bca.containsValue(1);
		System.out.println(bca3);
		Map<String,Integer> z1 = new HashMap<String,Integer>(); // upcasting
		z1.putAll(bca);
		z1.put("Parupi", 10);
		System.out.println(z1);
		
		boolean a1 = z1.equals(bca);
		System.out.println(a1);
		if(bca.size() == z1.size())
		{
			System.out.println(z1);
		}
		else
		{
			System.out.println("Provided value is not equals");
		}
		}
		}


