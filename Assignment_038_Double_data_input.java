package Day19_25July;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment_038_Double_data_input 
{
	public static void main(String[] args) 
	{
		System.out.println("How many double are "
				+ "you going to given \n");
		Scanner value = new Scanner(System.in);
		int q		=	value.nextInt();
		double	[]input_1	= new double[q];
		
		for (int i = 0; i < q; i++)
		{
			System.out.println("Provide your input "+ (i+1));
			input_1[i] = value.nextDouble();
		}
		System.out.println("Input of Double is - " 
		+ Arrays.toString(input_1));
	}
}
