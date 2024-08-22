package Day21_29July;
import java.util.Arrays;
public class Assignment_043_ANAGRAM 
{	public static void main(String[] args) 
	{	String input1 = "cheater";
		String input2 = "teacher";
		
		if(input1.length() != input2.length())
		{	System.out.println("No ANAGRAM");
		}
		else 
		{	char [] i1 = input1.toCharArray();
			char [] i2 = input2.toCharArray();	
			Arrays.sort(i1);
			Arrays.sort(i2);		
			System.out.println(Arrays.toString(i1));
			System.out.println(Arrays.toString(i2));
			
			boolean ans = Arrays.equals(i1, i2);
			if (ans == true)
			{	System.out.println("Its ANAGRAM");
			}
			else
			{	System.out.println("It's Not Anagram");
			}
		}		
	}
}
