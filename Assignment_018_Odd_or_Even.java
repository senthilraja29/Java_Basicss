package Day11_15July;

import java.util.Scanner;

public class Assignment_018_Odd_or_Even {

	public static void main(String[] args) {		
		Scanner inputs = new Scanner(System.in);
		System.out.println("Provide your input ");
		int a = inputs.nextInt();
		int b = (a%2);
		if ( b == 1)
			{	System.out.println("Input value is " + a + " ODD");}
		
		else if ( b == 0)
			{	System.out.println("Input value is " + a + " Even");}
		else
			{ System.out.println("Invalid input");}		
	}
}
