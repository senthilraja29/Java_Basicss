package Day20_26July;

import java.util.Arrays;

public class Assignment_041_Array_Reverse 
{
	public static void main(String[] args) 
	{
		String input = "Array";
		char[] value = input.toCharArray();
		char[] reverse_input = new char[input.length()];
		
		for(int i = 0,k = input.length()-1; i<input.length() ;i++,k--)
		{
			reverse_input[k] = value[i];
		}
		
		System.out.println(Arrays.toString(value));
		System.out.println(Arrays.toString(reverse_input));
	}
}
