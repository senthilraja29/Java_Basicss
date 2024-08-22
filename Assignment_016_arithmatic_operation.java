package Day11_15July;

import java.util.Scanner;

public class Assignment_016_arithmatic_operation {

	public static void main(String[] args) {
		
		Scanner inputs = new Scanner(System.in); 
		
		System.out.println("Enter your first input - ");
		double a = inputs.nextDouble();
		System.out.println("Enter your Second input - ");
		double b = inputs.nextDouble();
		
		// Arithmatic Operatiorns
		double Add = a+b; //Additions
		double Sub = a-b; //Subtraction
		double Multi = a*b; //Multiplication
		double Divi = a/b; //Division
		double Module = a%b; //Module
	
		System.out.println("Value of Addition is	" + Add);
		System.out.println("Value of Subtraction is	" + Sub);
		System.out.println("Value of Multiplication is " + Multi);
		System.out.println("Value of Division is	" + Divi);
		System.out.println("Value of Module is		" + Module);
	}
}
