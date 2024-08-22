package Day19_25July;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment_034_palindrome {
	public static void main(String[] args) {
		
		Scanner inp	= new Scanner(System.in);
		
		System.out.println("Enter your input \n");
		String inputs = inp.next();
		
		char[] sentence  = inputs.toCharArray();
		
		System.out.println(Arrays.toString(sentence));
		
		char[] reverse_ = new char[inputs.length()];
		
		for(int i = 0, k= inputs.length()-1; i<inputs.length();i++,k--) 
		{
			reverse_[k] = sentence[i];
		}
		System.out.println(Arrays.equals(reverse_, sentence));	
	}
}
