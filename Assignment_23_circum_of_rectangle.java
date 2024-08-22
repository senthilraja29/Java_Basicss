package Day12_16July;

import java.util.Scanner;

public class Assignment_23_circum_of_rectangle {

	public static void main(String[] args) {
		
		Scanner inputs = new Scanner(System.in);
		System.out.println("Input of A is - ");
		int a = inputs.nextInt();
		System.out.println("Input of B is - ");
		int b = inputs.nextInt();
		int Cirmcum_Rec  = 2 * (a+b);
		System.out.println("Circumference of Rectangle " + Cirmcum_Rec);
	}
}
