package Day32_13Aug;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.PriorityQueue;

public class Assignment_063_PriorityQueue {

	public static void main(String[] args) 
	{
		PriorityQueue<Integer> xyz = new PriorityQueue();
			xyz.add(10);
			xyz.add(9);
			xyz.add(12);
			xyz.add(12);
			xyz.add(14);
		System.out.println(xyz);
		
		Iterator<Integer>		x = xyz.iterator();
		
		System.out.println("Iterator Initiated");
		while(x.hasNext())
		{
			System.out.println(x.next());
		}
		
		//PriorityQueue is not support's LinkedIterator
	}

}
