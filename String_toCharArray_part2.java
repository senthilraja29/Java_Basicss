package Day18_24July;

import java.util.Arrays;

public class String_toCharArray_part2 {

		static int count_of_alphabet	= 0;
		static int count_of_space		= 0;
		static int count_of_numeric		= 0;

	public static void main(String[] args) {
		
		String Input = "eda no 20";
		char []q1 = Input.toCharArray();
		
		System.out.println("Input is - " + Arrays.toString(q1));
		
		System.out.println("Alphabet checking ");
		for(int i =0; i<Input.length();i++)
		{
		boolean answer = Character.isAlphabetic(q1[i]);
//		System.out.println(answer);
		if (answer==true) {
			count_of_alphabet++;	}
		}
		
		System.out.println("Total Alphabets are " + count_of_alphabet);
		
		System.out.println("Numeric checking : ");
		for(int i = 0; i<Input.length();i++)
		{
		boolean answer1 = Character.isDigit(q1[i]);
//		System.out.println(answer1);
		if (answer1==true) {
			count_of_numeric++; 
			}
		}
		System.out.println("Total Numeric are " + count_of_numeric);
		
		System.out.println("Space checking ");
		for(int i =0; i<Input.length();i++)
		{
		boolean answer2 = Character.isSpaceChar(q1[i]);
	//	System.out.println(answer2);
		if (answer2==true) {
			count_of_space++;
			}
		}
		System.out.println("Total Space are " + count_of_space);
	}
}
