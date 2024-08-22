package Day18_24July;

import java.util.Arrays;

public class String_toChar {

	public static void main(String[] args) {
		
		String Input = "eda no 20";
		char []q1 = Input.toCharArray();
		
		System.out.println(Arrays.toString(q1));
		
		
		for(int i =0; i<Input.length();i++)
		{
		boolean answer = Character.isAlphabetic(q1[i]);
		System.out.println(answer);
		}
		
		System.out.println("Numeric checking ");
		for(int i =0; i<Input.length();i++)
		{
		boolean answer1 = Character.isDigit(q1[i]);
		System.out.println(answer1);
		}
		
		System.out.println("Space checking ");
		for(int i =0; i<Input.length();i++)
		{
		boolean answer2 = Character.isSpaceChar(q1[i]);
		System.out.println(answer2);
		}
		
	}
}