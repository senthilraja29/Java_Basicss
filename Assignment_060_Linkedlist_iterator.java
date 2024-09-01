package Day32_13Aug;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Assignment_060_Linkedlist_iterator {
    public static void main(String[] args) {
        LinkedList<Integer> abc = new LinkedList<>();
        abc.add(70);
        abc.add(80);
        abc.add(90);
        abc.add(70);

        System.out.println("Original LinkedList: " + abc);

        Iterator<Integer> abc1 = abc.iterator();
        while (abc1.hasNext()) {
            int x = abc1.next();
            if (x == 70) {
                abc1.remove(); // remove 70
            }
        }

        System.out.println("Updated abc after removing 70: " + abc);

        // Using ListIterator list
        ListIterator<Integer> abc2 = abc.listIterator();
        abc2.add(60); // Add 60 
        abc2.next();  // Move the cursor (80)
        abc2.set(70); // Replace 80 with 70
        abc2.next();  // Move to the next element (90)

        abc2 = abc.listIterator();
        // Need to reset the listIterator
        
        // Forward iteration
        System.out.println("\nForward iteration:");
        while (abc2.hasNext()) {
            System.out.println(abc2.next());
        }

        // Backward iteration
        System.out.println("\nBackward iteration:");
        while (abc2.hasPrevious()) {
            System.out.println(abc2.previous());
        }
    }
}
