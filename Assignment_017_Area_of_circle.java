package Day11_15July;

import java.util.Scanner;

public class Assignment_017_Area_of_circle {
 
	public static void main(String[] args) {
	
		Scanner inputs = new Scanner(System.in);
		
		System.out.println("Provide Your Input - ");
		double r = inputs.nextDouble();
		double pi	= 3.14;
		
		double area_of_circle = pi*r*r;
		
		System.out.println("Area of Circle is " + area_of_circle);
		System.out.println("Input of r value is " + r);
	}
	
}
