package Day19_25July;

import java.util.Arrays;

public class Assignment_033_reverse_string {
	public static void main(String[] args) {
	 
		String name		= "Apple";
		
		char []name_1	= name.toCharArray();
		
		System.out.println(Arrays.toString(name_1));
		
		char []name_2	= new char[name.length()];
		
		for(int i = 0, k = name.length()-1 ; i <name.length();i++,k--) {
			name_2[k] = name_1[i];
		}
		System.out.println(Arrays.toString(name_2));
	}
}
