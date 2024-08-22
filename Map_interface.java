package Day34_15Aug;

import java.util.HashMap;
import java.util.Map;

public class Map_interface 
{
	public static void main(String[] args) 
	{
		Map<String,Integer> a1 = new HashMap<String,Integer>();
		a1.put("Ram", 26);
		a1.put("lakshman", 22);
		a1.put("Hanuman", 20);
		a1.put("Seetha", 18);
		System.out.println(a1);
		a1.remove("lakshman", 22);
		System.out.println(a1);
		a1.put("Janagar", 86);
		System.out.println(a1);
		a1.replace("Ram", 27);
		System.out.println(a1);
		a1.put("Ravan", 80);
		System.out.println(a1);
		a1.replace("Ravan", 83);
		System.out.println(a1);
		a1.put("Vibishnan", 80);
		System.out.println(a1);
		a1.replace("Vibishnan", 78); //replace 
		System.out.println(a1);
		a1.replace("Vibishnan", 78, 76); //replace old value / new value
		System.out.println(a1);
		
	}
}
