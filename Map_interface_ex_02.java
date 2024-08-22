package Day33_14Aug;

import java.util.HashMap;
import java.util.Map;

public class Map_interface_ex_02 
{
	public static void main(String[] args) 
	{
		Map<String,String> abc = new HashMap();	//Upcasting
		abc.put("Roll.No-01", "Senthil");
		abc.put("Roll.No-02", "Bhavani");
		abc.put("Roll.No-03", "Shanthi");
		abc.put("Roll.No-04", "Raja");
		abc.put("Roll.No-05", "Hema");
		
		System.out.println(abc);
		
	}
}
