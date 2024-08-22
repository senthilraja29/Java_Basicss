package Day27_6Aug;

import java.util.Arrays;
import java.util.FormatFlagsConversionMismatchException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class try_catch 
{
	public static void main(String[] args) 
	{
		int rollno[] = new int[4];
		rollno[0] = 20;
		rollno[1] = 21;
		rollno[2] = 22;
		rollno[3] = 23;
		try
		{
			Scanner q = new Scanner(System.in);
			System.out.println("Give Your Another Input in Array");
			rollno[4] = q.nextInt();
			
		}
		
		catch(ArrayIndexOutOfBoundsException a2) 
		{	
			System.out.println("handle 1");
		}
		catch(InputMismatchException a2) 
		{	
			System.out.println("handle 2");
		}
		catch(ArithmeticException a2) 
		{	
			System.out.println("handle 3");
		}
		catch(StringIndexOutOfBoundsException a2)
		{
			System.out.println("Handle 4");
		}
		
	//	System.out.println("The roll no's are " + Arrays.toString(rollno));
		
		finally
		{
			System.out.println("Thank You For Running Programs");
		}
		System.out.println("The roll no's are " + Arrays.toString(rollno));
		
	}
}
