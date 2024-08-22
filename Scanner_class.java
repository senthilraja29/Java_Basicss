package Day11_15July;

import java.util.Scanner;

public class Scanner_class {

	public static void main(String[] args) {
		
		// lets do multiplication of 10 number at run time
		
		Scanner s1 = new Scanner(System.in);
		
//		System.	in ->	to take the value of input
//		System.	out ->	to take the value of OUTput
		System.out.println("Please enter your 1st number");
		int x = s1.nextInt();

		System.out.println("Please enter your 2nd number");
		int y = s1.nextInt();
		
		int multi = x*y;
		int add = x+y;
		int divi = x/y;
		int subt = x-y;
		int modul = x%y;
		
		
		System.out.println("Multiplication of the 2 numbers output is	-- "+ multi +" and value of x " + x + " and y is " + y);
		System.out.println("Addition of the 2 numbers output is 		-- "+ add +" and value of x " + x + " and y is " + y);
		System.out.println("Subtraction of the 2 numbers output is 		-- "+ subt +" and value of x " + x + " and y is " + y);
		System.out.println("Division of the 2 numbers output is 		-- "+ divi +" and value of x " + x + " and y is " + y);
		System.out.println("modulus of the 2 numbers output is 			-- "+ modul +" and value of x " + x + " and y is " + y);

		
	}
}
