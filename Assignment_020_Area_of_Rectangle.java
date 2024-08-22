package Day12_16July;

import java.util.Scanner;

public class Assignment_020_Area_of_Rectangle {
	
	public static void main(String[] args) {
	
		Scanner inputs = new Scanner(System.in);
		System.out.println("Input of l - ");
		int l = inputs.nextInt();
		System.out.println("Input of b - ");
		int b = inputs.nextInt();
		int Area = Math.multiplyExact(l, b);
		System.out.println("Area of Rectangle is " + Area);
}
}
