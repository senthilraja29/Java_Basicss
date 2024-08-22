package Day26_5Aug_try_catch;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Assignment_048_Exception 
{
	public static void main(String[] args) 
	{
		Scanner inputs = new Scanner(System.in);
		System.out.println("Take Input");
		int a = 3;
		int c = 4;
		int[] name1 = new int[a]; // No of Array Input - a
		//InputMismatchException
		try {	
				System.out.println("Provide Int Input");
				int name = inputs.nextInt();
				System.out.println("Your Input is " +name);
				
				System.out.println("Give Input");
				for(int d = 0; d <= c; d++) 
				{	System.out.println(("Input " + (d+1) + " is \n" ));
					name1[d] = inputs.nextInt();
				}
				System.out.println(Arrays.toString(name1));
			}
		catch(InputMismatchException ax)
		{
			System.out.println("Input Mismatched Handled");
			inputs.nextLine();
		}
		catch(ArrayIndexOutOfBoundsException az)
		{	System.out.println("No of Array Capacity is " + a);
			System.out.println("No of Array input is " + c);
			System.out.println("Index Out of Bounds Exception Habndled");
			System.out.println(Arrays.toString(name1));
		}
	}		
}
