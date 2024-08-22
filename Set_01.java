package Day29_30_9Aug;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Set_01 
{
	public static void main(String[] args) 
	{
		Set s1 = new HashSet();
		s1.add(350);
/*		s1.add("ram");
		s1.add(null);
		s1.add(null);
		s1.add(null);	*/
		s1.add(100);
		s1.add(300);
		s1.add(500);
		s1.add(700);
		s1.add(900);
		
		List convert_list = new ArrayList(s1);
		Collections.sort(convert_list);
		
		System.out.println(convert_list);
		System.out.println(s1);
	}
}
