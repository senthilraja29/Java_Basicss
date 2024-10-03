package Assignments;

import java.util.Arrays;

//Palindrome
public class viva_002 
{
	public static void main(String[] args) 
	{
		String input = "NooN";
		String input_1[] = new String[input.length()];
		String input_2[] = new String[input.length()] ;
		for(int i = 0, k = input.length()-1; i <input.length() ; i++, k--)
		{
			input_2[k] =  input_1[i] ;
		}
		System.out.println(input_1.toString());
	//	System.out.println(Arrays.toString(input_1));
		
	}
}
