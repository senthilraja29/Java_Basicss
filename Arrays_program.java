package Day17_23July;

import java.util.Arrays;

public class Arrays_program {

	public static void main(String[] args) {
		String name[] = new String[5]; 
		name[0]="Bhavani"; 
		name[1]="Senthil"; 
		name[2]="Raja"; 
		name[3]="Ram"; 
		
		System.out.println(Arrays.toString(name));

		int rollno[] = new int[5];	
		rollno[0]=24;	
		rollno[1]=19;	
		rollno[2]=6;	
		rollno[3]=34;	
	//	rollno[4]=26;	
		
		Arrays.sort(rollno);
		System.out.println(Arrays.toString(rollno));
		
	//	System.out.println(Arrays.toString(rollno));

	}
}
