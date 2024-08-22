package Day19_25July;

import java.util.Arrays;

public class Array_reverse {

	public static void main(String[] args) {
		
		int oldarray[]=new int[3];
		oldarray[0]=71;
		oldarray[1]=6;
		oldarray[2]=78;
		int reverse_array[]=new int[3];
		/*
		reverse_array[2]	=		oldarray[0];
		reverse_array[1]	=		oldarray[1];
		reverse_array[0]	=		oldarray[2];
		*/
		for(int i=0,k=reverse_array.length-1;i<oldarray.length;i++,k--)
		{
		reverse_array[k]	=		oldarray[i];
		}
		System.out.println(Arrays.toString(oldarray));
		System.out.println(Arrays.toString(reverse_array));
		
		
	}
}