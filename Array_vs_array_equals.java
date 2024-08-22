package Day19_25July;

import java.util.Arrays;

public class Array_vs_array_equals {

	public static void main(String[] args) {
		
		int rollno[] = new int[4];
		int rollno1[] = new int[4];
		rollno[0]=90;
		rollno[1]=56;
		rollno[2]=12;
		rollno[3]=40;
		rollno1[0]=90;
		rollno1[1]=56;
		rollno1[2]=12;
		rollno1[3]=40;
		boolean b1 = Arrays.equals(rollno, rollno1);
		System.out.println(b1);
	}
}
