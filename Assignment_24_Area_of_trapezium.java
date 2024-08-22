package Day12_16July;

import java.util.Scanner;

public class Assignment_24_Area_of_trapezium {

	public static void main(String[] args) {
		
		Scanner inputs = new Scanner(System.in);
		System.out.println("Input of a - " );
		int a = inputs.nextInt();
		System.out.println("Input of b - " );
		int b = inputs.nextInt();
		System.out.println("Input of h - " );
		int h = inputs.nextInt();
		float Area_of_trapezium = (float) (0.5 * (a+b)* h);
		System.out.println("Area_of_trapezium is " + Area_of_trapezium);
		
	}
}
