package Day12_16July;

import java.util.Scanner;

public class Assignment_21_Circum_of_circle {

	public static void main(String[] args) {
		
		final float pi = 3.14f;
		System.out.println("Input of r - ");
		Scanner input = new Scanner(System.in);
		float r = input.nextFloat();
		float circum_of_circle = 2*pi*r;
		System.out.println("Circum_of_circle is " + circum_of_circle);
		
	}
}
