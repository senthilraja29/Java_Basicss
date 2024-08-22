package Day20_26July;
import java.util.Arrays;
import java.util.Scanner;
public class Assignment_039_Array_Checking 
{	
	public static void main(String[] args) 
	{	int z = 100,w,pre = 0; 
		String present = null,not_present = null;
		Scanner input = new Scanner(System.in);
		System.out.println("Total No.of 100's -\n");
		int a = input.nextInt();
		int value[] = new int[a];	
		for(int b = 0; b < a; b++)
		{	value[b] = (b+1)*z;	}
		System.out.println(Arrays.toString(value));
		System.out.println("Provide your input to cross check \n");
		int q = input.nextInt();
		for( w = 0; w <value.length; w++)
		{	
			if (value[w] == q) 
			{	present = "pass";
				pre 	= w;			}
			else
			{	not_present = "fail";	}
		}
		if (present=="pass")
		{	System.out.println("Your input is present in this Array "
			+ (pre+1)+ ".\nCross check no is - " + value[pre]);	}
		else
		{ 	System.out.println("Your input is not present in this Array");}
		
	}
}
