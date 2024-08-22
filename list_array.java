package Day_two;

import java.util.ArrayList;
import java.util.List;

public class list_array {

    public static void main(String[] args) {
    
        List<Integer> arrayList = new ArrayList<Integer>(); // No need to specify initial capacity
        
        for (int i = 1; i <= 10; i++) {
            arrayList.add(i);
        }
        
        // result
        System.out.println(arrayList);
        
        arrayList.remove(3);
        
        System.out.println(arrayList);
        
        for (int i = 1; i < arrayList.size(); i ++)
        	System.out.print(arrayList.get(i) + "@ ");
        
        for (int i = 1; i < arrayList.size(); i ++)
        	System.out.println(arrayList.get(i) + "/");
    }
}
