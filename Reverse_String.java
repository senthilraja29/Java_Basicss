package Day18_24July;

import java.util.Scanner;

public class Reverse_String {

	public static void main(String[] args) {
		
		Scanner inputs = new Scanner(System.in);
		
		System.out.println("Enter your String - ");
		
		String name = inputs.next();
		
		int a = name.length();
		
		String Output = "";
	
		for(int i = (a-1); i >= 0; i--) {
		
			char a1 = name.charAt(i);
			Output = Output + a1;
		}
		
		System.out.println("The reverse of the input is ->"+Output);
	}
}
