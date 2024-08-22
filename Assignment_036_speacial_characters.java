package Day19_25July;

import java.util.Arrays;

public class Assignment_036_speacial_characters 
{
	static int alpha,num,spac,spl,total;
	public static void main(String[] args) 
	{
		String Welcome = "Hi, Could You please call this number? - 100!";
		char []data = Welcome.toCharArray();
		System.out.println(Arrays.toString(data));
		
		for(int i = 0; i <Welcome.length();i++ )
		{
			if((Character.isAlphabetic(data[i])) ==true) 
			{		alpha++;		}
			else if ((Character.isDigit(data[i]))== true)
			{		num++;			}
			else if ((Character.isSpace(data[i]))== true)
			{		spac++;			}
			else
			{		spl++;			}
		}
		System.out.println("Total Character's present - "
				 + Welcome.length());
		System.out.println("Total Alphabetic's -	" +alpha);
		System.out.println("Total Number's -		" +num);
		System.out.println("Total Space's -			" +spac);
	//	System.out.println("Total Speacial Character's - " +spl);
		total = (Welcome.length()-(alpha+num+spac));	
		System.out.println("Total Speacial Character's present - " 
		+ total) ;
	}
}
