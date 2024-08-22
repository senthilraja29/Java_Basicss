package Day19_25July;

import java.util.Arrays;

public class Assignment_037_Arrays_equals 
{
	public static void main(String[] args) 
	{
		String input_1 = "Happy";
		char[] check_1 = input_1.toCharArray();
		String input_2 = "Happy";
		char[] check_2 = input_2.toCharArray();
		String input_3 = "Very Happy";
		char[] check_3 = input_3.toCharArray();
		
		System.out.println("Input 1 & 2 Equals to each other - "  + Arrays.equals(check_1, check_2));
		System.out.println("Input 2 & 3 Equals to each other - "  + Arrays.equals(check_2, check_3));
		
	}
}
