package Day19_25July;

import java.util.Arrays;

public class Assignment_035_alp_num_spac_characters {

	public static void main(String[] args) {
		String inputs 	= "123 /*- Senhtil";
		char []input	= inputs.toCharArray();
		
		System.out.println(Arrays.toString(input));
		
		int alpha_count = 0;
		int numer_count = 0;
		int space_count = 0;
		int spl_count 	= 0;
		
		for (int i = 0; i<inputs.length(); i++) {
			if (Character.isAlphabetic(input[i])== true) {
				alpha_count++;	}
			else if (Character.isSpace(input[i])== true) {
				space_count++;	}
			else if (Character.isDigit(input[i])== true) {
				numer_count++;	}
			else {
				spl_count++;	}	
		}
		System.out.println("alpha_count "+alpha_count + "\nnumer_count " 
		+ numer_count+ "\nspace_count " + space_count
				+ "\nspl_count " + spl_count);
		System.out.println("Total Count " + inputs.length());
	}
}
