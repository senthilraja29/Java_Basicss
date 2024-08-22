package Day20_26July;

import java.util.Arrays;

public class Assignment_040_Array_Copy 
{
public static void main(String[] args) {
	int value[] = new int[3];
		value[0] = 100;
		value[1] = 100;
		value[2] = 100;
	int[] q = value.clone();
	int[] w = Arrays.copyOf(value, value.length);
	int[] e = new int[value.length];
	System.arraycopy(value, 0, e, 0, value.length); 
	// 0 mentions starting point of the array point
	System.out.println("Method 1 and q is "+ Arrays.toString(q));
	System.out.println("Method 2 and w is "+ Arrays.toString(w));
	System.out.println("Method 3 and e is "+ Arrays.toString(e));
}
}
