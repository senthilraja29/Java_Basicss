package Day12_16July;

import java.util.Scanner;

public class Assignment_019_Area_of_Triangle {

	public static void main(String[] args) {
		
		Scanner inputs = new Scanner(System.in);
		System.out.println("Input of B - ");
		int b = inputs.nextInt();
		System.out.println("Input of H - ");
		int h = inputs.nextInt();
		float multi = Math.multiplyExact(b, h);
		float Area = Math.floorDiv((int) multi, 2);
		System.out.println("Area of Triangle is - " + Area);
		
	}
}
