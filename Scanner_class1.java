package Day26_5Aug_try_catch;

import java.util.InputMismatchException;
//import java.util.InputMismatchException;
import java.util.Scanner;

public class Scanner_class1 
{
	public static void main(String[] args) 
	{
		Scanner inputs = new Scanner(System.in);	
		try 
		{
			System.out.println("Enter your Age \n");
			int age = inputs.nextInt();
			System.out.println("Your age is " + age);
			
		}
		catch(InputMismatchException a1)
		{
			System.out.println("Your age input is wrong");
			inputs.nextLine(); // Clear the invalid input from the scanner
			
		}		
		try
		{
			System.out.println("Enter your Height \n");
			int height = inputs.nextInt();
			System.out.println("Your Height is " + height);
			inputs.close();
		}					
		catch(InputMismatchException e)
		{
			System.out.println("Your Height input is wrong");
			 // again if we making means it takes error
			Scanner input_1 = new Scanner(System.in);
			// input_1 is occur here
			System.out.println("Enter your Height \n");
			int height = input_1.nextInt();
	//		System.out.println("Your Height is " + height);
			input_1.close();
		}
		
		System.out.println("Program Completed");
		inputs.close();
	}
}
