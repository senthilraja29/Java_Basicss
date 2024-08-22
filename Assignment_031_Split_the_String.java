package Day17_23July;
import java.util.Arrays;
import java.util.Scanner;

public class Assignment_031_Split_the_String {

	public static void main(String[] args) {
				
		String inputs 	= "Hello, Very good Morning. Welcome to this Program";
		String []names	= inputs.split(" ");		
		
		String []words	= new String[names.length];
		
		for(int i = 0; i< names.length; i++)
		{
			words[i]	= names[i];
		}
		
		for(int a = 0; a < words.length; a++) {
			System.out.println( "Word " + (a + 1) + "  - "   + words[a]); 	
		}
	}
}
