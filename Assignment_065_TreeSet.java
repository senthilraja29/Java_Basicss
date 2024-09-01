package Day32_13Aug;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.TreeSet;

public class Assignment_065_TreeSet 
{
	public static void main(String[] args) 
	{
		TreeSet<Integer> value = new TreeSet();
		value.add(7);
		value.add(8);
		value.add(9);
		value.add(7);
		System.out.println(value);
		Iterator<Integer> abc1 = value.iterator();
		System.out.println("Iterator Display");
		while(abc1.hasNext())
		{
			System.out.println(abc1.next());
		}
		System.out.println("ListofIterator is not available in Treeset");
		
	}
}
