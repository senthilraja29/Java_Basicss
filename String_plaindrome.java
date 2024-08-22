package Day18_24July;

import java.util.Scanner;

public class String_plaindrome {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Provide your input - \n");
		String in_str = input.next(); 
		String Output = "";
		
		for(int i = in_str.length()-1 ; i>=0 ;i--) {
			
		char a =  in_str.charAt(i);
		
		Output = Output+ a;
		}
		System.out.println("Your Input is "+ in_str);
		System.out.println("Your Reverse Input is "+ Output);
		
		if(in_str.equals(Output)) {
			System.out.println("Your Input is PlainDrome");
		}
		else {
			System.out.println("Your Input is not PlainDrome");
		}
			
	}
}
