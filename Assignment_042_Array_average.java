package Day20_26July;

import java.util.Scanner;

public class Assignment_042_Array_average 
{
	public static void main(String[] args) 
	{
		Scanner z = new Scanner(System.in);
		System.out.println("Input Range");
		int x = z.nextInt();
		int []y = new int[x];
		int sum = 0;
		for (int i = 0; i <y.length;i ++)
		{
			System.out.println("Provide Your "+ (i+1)+" input of Array");
			y[i] = (int) z.nextInt();
			sum = sum + y[i];
		}
		System.out.println("Average input of the Array is "+(sum/4));
	}
}
