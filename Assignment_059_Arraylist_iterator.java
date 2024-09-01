package Day32_13Aug;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Assignment_059_Arraylist_iterator 
{
	static int iter_value;
	public static void main(String[] args) 
	{
		ArrayList<Integer>  values = new ArrayList();
			values.add(10);
			values.add(20);
			values.add(30);
		System.out.println("Values Inside ArrayList " +values);
		
		Iterator<Integer>  value1 = values.iterator();
		System.out.println("Iterator concept in ArrayList Values");	
		while (value1.hasNext()) {
            int nextValue = value1.next(); //Store
            System.out.println(nextValue);

            if (nextValue == 30) { //remove
                value1.remove(); 
            }
        }
       
		System.out.println("Modified list:");
        for (int value : values) { //Updated Iterator
            System.out.println(value);
        }
		
		ListIterator<Integer> value2 = values.listIterator();
			value2.nextIndex();
			value2.add(30);
			value2.next();
			value2.add(40);
			value2.next();
		System.out.println("ListIterator concept in ArrayList Values (forward method)");
		while(value2.hasPrevious())
		{
			System.out.println(value2.previous());
		}
		System.out.println("ListIterator concept in ArrayList Values (backward method)");
		while(value2.hasNext())
		{
			System.out.println(value2.next());
		}
		
	}
}
