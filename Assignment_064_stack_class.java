package Day32_13Aug;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;

public class Assignment_064_stack_class 
{
	public static void main(String[] args) 
	{
		Stack<Integer> value = new Stack();
		value.add(7);
		value.add(8);
		value.add(9);
		value.add(7);
		
		Iterator<Integer> abc1 = value.iterator();
		System.out.println("Iterator Display");
		while(abc1.hasNext())
		{
			System.out.println(abc1.next());
		}
		ListIterator<Integer> abc2 = value.listIterator();
		System.out.println("ListIterator Display (forward)");
		while(abc2.hasNext())
		{
			System.out.println(abc2.next());
		}
		System.out.println("ListIterator Display (backward)");
		while(abc2.hasPrevious())
		{
			System.out.println(abc2.previous());
		}
	}
}
