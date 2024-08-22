package Day16_22July;

import java.util.Scanner;

public class switch_case {

	public static void main(String[] args) {
		
		System.out.println("Press 1 for Chrome");
		System.out.println("Press 2 for Firefox");
		System.out.println("Press 3 for Edge");
		
		Scanner q1 = new Scanner(System.in);
		System.out.println("Your Input is - ");
		
		int inputs = q1.nextInt();
		switch (inputs)
		{
		case 1 : System.out.println("Launch Chrome Browser");;
		              break;
		case 2 : System.out.println("Launch Fire Fox browser");;
		              break;
		case 3 : System.out.println("Launch Edge Browser");;
		              break;
		default:
		         System.out.println("Sorry Your selection is wrong");;
		}
				
				
				
				
				
				
				
				
				
				

		
		
		
	}
}
