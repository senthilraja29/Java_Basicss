package Day17_23July;

import java.util.Arrays;

public class StringFunction_02 {
	public static void main(String[] args) {
		
		int rollno[] = new int[5];	
		rollno[0]=24;	
		rollno[1]=19;	
		rollno[2]=6;	
		rollno[3]=34;	
		rollno[4]=26;	
		
		System.out.println(rollno[4]); //first method
		
		for(int i=0; i <5 ; i++) {		// Second Method
			System.out.println(rollno[i]);
		}
		
		System.out.println(Arrays.toString(rollno)); //Third method
		
		String name[] = new String[5];	
		name[0]="Bhavani";	
		name[1]="Senthil";	
		name[2]="Raja";	
		name[3]="Ram";	
		name[4]="Seetha";
		
		for(int i=0; i <5 ; i++) {		// Second Method
			System.out.println(name[i]);
		}
		
		System.out.println(name[2]);

	}
}
