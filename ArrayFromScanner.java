package Day19_25July;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayFromScanner {

	public static void main(String[] args) {
	
		int rollno[] = new int[3];
		Scanner s1= new Scanner(System.in);
		System.out.println("Give your input ");
		for(int i=0;i<rollno.length;i++) {
			rollno[i] = s1.nextInt();
		}
		System.out.println(Arrays.toString(rollno));
	}
}
