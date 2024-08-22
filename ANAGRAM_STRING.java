package Day21_29July;

import java.util.Arrays;

public class ANAGRAM_STRING {
	public static void main(String[] args) 
	{
	
		String name_1 = "face";
		String name_2 = "aafe";
		
		if(name_1.length()!= name_2.length()  ) 
		{
			System.out.println("No Anagram");
		}
		else 
		{
			char []n1 = name_1.toCharArray();
			char []n2 = name_2.toCharArray();
		
			Arrays.sort(n1);
			Arrays.sort(n2);
			
			System.out.println(Arrays.toString(n1));
			System.out.println(Arrays.toString(n2));
		
			boolean ans = Arrays.equals(n1, n2);
			System.out.println(ans);
			if(ans==true) 
			{
				System.out.println("Yes its anagram");
			}
			else 
			{
				System.out.println("Its nOt anagram");
			}
		
		}
	}
}
