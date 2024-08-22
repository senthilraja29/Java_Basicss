package Day27_6Aug;

import java.util.Scanner;

public class Throw_keyword 
{
	public static void main(String[] args) throws NullPointerException  //Declare the exception by using throws
, InterruptedException
	{
		
		for(int i = 0; i< 10; i++)
		{
			System.out.println(i);
			Thread.sleep(2000);
		}
		Scanner value = new Scanner(System.in);
		throw new NullPointerException("Sorry the file is Empty 1");		
	
		
	
	}
}
































