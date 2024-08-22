package Day27_6Aug;

import java.util.Scanner;

public class Assignment_049_Str_outofbound_exception 
{
	public static void main(String[] args) 
	{
		Scanner inputs	= new Scanner(System.in);
		System.out.println("Type ToDay's  Below \n");
		
		try 
		{
		String give	= inputs.next();
		System.out.println("Day Letter's in Count - " + give.length());
		System.out.println(give.charAt((give.length()+1)));
		}
		catch(StringIndexOutOfBoundsException a2)
		{
			System.out.println("String Out of Bounds Exception Handled");
		}
	}
}
