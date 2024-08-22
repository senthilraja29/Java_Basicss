package Day29_30_9Aug;
import java.util.*;

public class set_practice 
{

    public static void main(String[] args) 
    	{
	        Set<Integer> numbers = new HashSet<>();
	        numbers.add(350);
	        numbers.add(100);
	        numbers.add(300);
	        numbers.add(500);
	        numbers.add(700);
	        numbers.add(900);

	        // Convert to a List for sorting
	        List<Integer> sortedList = new ArrayList<>(numbers);
	        Collections.sort(sortedList);

	        System.out.println("Original set: " + numbers);
	        System.out.println("Sorted list: " + sortedList);
	    }
}


