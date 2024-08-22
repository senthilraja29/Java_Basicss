package Day17_23July;

import java.util.Scanner;

public class Assignment_032_switch_case {
	public static void main(String[] args) {
		
		System.out.println("Enter the browser name");
		
		Scanner browser = new Scanner(System.in);
		System.out.println("Google/FireFox/Brave/Edge");
		String 	inputs	= browser.next();
		
		switch (inputs) {
		case "Google" 	: System.out.println("Opne the Google Browser");
	break;
		case "FireFox"	: System.out.println("Opne the FireFox Browser");
	break;
		case "Brave"	: System.out.println("Opne the Brave Browser");
	break;
		case "Edge"		: System.out.println("Opne the Edge Browser");
		}
	}
}
