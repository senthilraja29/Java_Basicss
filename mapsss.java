package Day_two;

import java.util.HashMap;
import java.util.Map;

public class mapsss {

	public static void main(String[] args) {
		
		Map< String, Integer > studentid = new HashMap<>();
		
		studentid.put("Ram", 101);
		studentid.put("Lakshman", 100);
		studentid.put("Seetha", 103);
		studentid.put("Hanuman", 104);
		studentid.put("Sukrivan", null);
			
		System.out.println(studentid);
		
		System.out.println(studentid.get("Ram"));
		
		System.out.println(studentid.get(103));
		System.out.println(studentid.containsKey("Ram"));
		System.out.println(studentid.containsValue(103));
		
		
		studentid.remove("Seetha");
		System.out.println(studentid);
		
		studentid.put("Ram", 100);
		System.out.println(studentid.get("Ram"));

		studentid.putIfAbsent("Ram", 10);
		studentid.putIfAbsent("Sukrivan", 97);
		System.out.println(studentid);
		
		studentid.replace("Ravanan", 105);
		studentid.replace("Hanuman", 110);
		System.out.println(studentid);
		
		System.out.println("-----------------------------------");
		
		if (studentid.containsKey("Ram"))
		{	Integer Ram = studentid.get("Ram");
			System.out.println("Value of  Ram is " + Ram);
		}
				
		if (studentid.containsKey("Ram"))
			for (String key : studentid.keySet()) {
				System.out.println("Key " + key + " - XXX " + studentid.get(key));
		}
		for (Map.Entry<String, Integer> entry : studentid.entrySet()) {
		    System.out.println("Entry Key - " + entry.getKey() + " - Value: " + entry.getValue());
		}

		
	
	}
	
	
}